package model.result;

import model.ladder.LadderRow;
import model.player.Player;

import java.util.List;

public class DecideResult {
    private int moveColumn(List<Boolean> points, int columnPosition){
        if(columnPosition!=0 && points.get(columnPosition-1)==true){
            return --columnPosition;
        }
        if(columnPosition!=points.size() && points.get(columnPosition)==true) {
            return ++columnPosition;
        }
        return columnPosition;
    }

    private int moveRow(List<LadderRow> ladderRows, int columnPosition){
        for (LadderRow ladderRow : ladderRows) {
            List<Boolean> points = ladderRow.getPoints();
            columnPosition = moveColumn(points, columnPosition);
        }
        return columnPosition;
    }

    public void decidePlayerResult(List<Player> playerInventory, List<LadderRow> ladderRows, List<String> trialResults){
        for (Player player : playerInventory) {
            int playerPosition = player.getPosition();
            int columnPosition = moveRow(ladderRows, playerPosition);
            String result = trialResults.get(columnPosition);
            player.settingResult(result);
        }
    }
}
