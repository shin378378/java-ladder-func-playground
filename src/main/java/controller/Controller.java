package controller;

import model.*;

import model.ladder.Ladder;
import model.ladder.LadderRow;
import model.player.Player;
import model.player.Players;
import model.result.DecideResult;
import model.result.Results;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {
    InputView inputView = new InputView();
    Splitter splitter = new Splitter();
    OutputView outputView = new OutputView();

    private Players createPlayers() {
        String playerNamesBeforeSplit = inputView.inputPlayers();
        String[] playerNames = splitter.split(playerNamesBeforeSplit);
        List<Player> playersInventory = new ArrayList<>();
        for (int i = 0; i < playerNames.length; i++) {
            Player player = new Player(i, playerNames[i]);
            playersInventory.add(player);
        }
        Players players = new Players(playersInventory);
        return players;
    }

    private Results createResults() {
        String trialResultsBeforeSplit = inputView.inputResults();
        String[] trialResults = splitter.split(trialResultsBeforeSplit);
        Results results = new Results(Arrays.asList(trialResults));
        return results;
    }

    private Ladder createLadder(int columnSize) {
        int rowSize = inputView.inputLadderHeight();

        List<LadderRow> ladderRows = new ArrayList<>();
        for (int i = 0; i < rowSize; i++) {
            LadderRow ladderRow = new LadderRow(columnSize);
            ladderRows.add(ladderRow);
        }
        Ladder ladder = new Ladder(ladderRows);
        return ladder;
    }

    private List<LadderRow> createLadderResult(List<Player> playerInventory, List<String> trialResults){
        Ladder ladder = createLadder(playerInventory.size()-1);
        List<LadderRow> ladderRows = ladder.getRows();
        OutputView outputView = new OutputView();
        outputView.outputLadder(playerInventory, ladderRows, trialResults);
        return ladder.getRows();
    }

    public void playLadderGame(){
        Players players = createPlayers();
        List<Player> playerInventory = players.getPlayerInventory();
        Results results = createResults();
        List<String> trialResults = results.getTrialResults();
        List<LadderRow> ladderRows = createLadderResult(playerInventory, trialResults);
        DecideResult decideResult = new DecideResult();
        decideResult.decidePlayerResult(playerInventory, ladderRows, trialResults);
        String playerName;
        do{
            playerName = inputView.inputPlayerToWantResult();
            outputView.outputPlayerResult(players, playerName);
        }while(!playerName.equals("all"));
    }
}
