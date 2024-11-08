package view;

import model.player.Player;
import model.ladder.LadderRow;
import model.player.Players;

import java.util.List;

public class OutputView {
    private static final int COLUMN_LENGTH = 5;

    private void outputPlayer(List<Player> playerInventory) {
        for (Player player : playerInventory) {
            String playerName = player.getName();
            System.out.printf("%" + COLUMN_LENGTH + "s", playerName);
            System.out.printf(" ");
        }
    }

    private void outputLadderRow(List<Boolean> points) {
        System.out.println();
        System.out.print("    |");
        for (int i = 0; i < points.size(); i++) {
            outputLadderColumn(points.get(i));
        }
    }

    private void outputLadderColumn(Boolean bool){
        if (bool == true) System.out.print("-----|");
        if (bool == false) System.out.print("     |");
    }

    public void outputLadder(List<Player> playerInventory, List<LadderRow> ladderRows, List<String> trialResults) {
        System.out.println("\n"+"사다리 결과"+"\n");
        outputPlayer(playerInventory);
        for (int i = 0; i < ladderRows.size(); i++) {
            List<Boolean> points = ladderRows.get(i).getPoints();
            outputLadderRow(points);
        }
        outputResults(trialResults);
        System.out.println();
    }

    private void outputResults(List<String> trialResults) {
        System.out.println();
        for (String trialResult : trialResults) {
            System.out.printf("%" + COLUMN_LENGTH + "s", trialResult);
            System.out.printf(" ");
        }
    }

    private void outputAllPlayersResult(List<Player> playerInventory) {
        for (Player player : playerInventory) {
            String playerName = player.getName();
            String playerResult = player.getResult();
            System.out.println(playerName + " : " + playerResult);
        }
    }

    private void outputCertainPlayerResult(Players players, String playerName) {
        String playerResult = players.getCertainPlayerResult(playerName);
        if(playerResult==null){
            System.out.println("존재하지 않는 사용자입니다.");
        }
        else if(playerResult!=null){
            System.out.println(playerName + " : " + playerResult);
        }
    }

    public void outputPlayerResult(Players players, String playerName) {
            System.out.println("\n" + "실행결과");
            if (playerName.equals("all")) {
                outputAllPlayersResult(players.getPlayerInventory());
                return;
            }
            outputCertainPlayerResult(players, playerName);
    }
}
