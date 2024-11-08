package controller;

import model.*;

import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {
    InputView inputView = new InputView();
    Splitter splitter = new Splitter();
    OutputView outputView = new OutputView();

    private Participants createParticipants() {
        String participantNamesBeforeSplit = inputView.inputParticipants();
        String[] participantNames = splitter.split(participantNamesBeforeSplit);
        List<Participant> participantsInventory = new ArrayList<>();
        for (int i = 0; i < participantNames.length; i++) {
            Participant participant = new Participant(i, participantNames[i]);
            participantsInventory.add(participant);
        }
        Participants participants = new Participants(participantsInventory);
        return participants;
    }

    private List<String> createResults() {
        String trialResultsBeforeSplit = inputView.inputResults();
        String[] trialResults = splitter.split(trialResultsBeforeSplit);
        Results results = new Results(Arrays.asList(trialResults));
        return results.getTrialResults();
    }

    private Ladder createLadder(int columnSize) {
        int rowSize = inputView.inputLadderHeight();
        Ladder ladder = new Ladder();
        List<LadderRow> ladderRows = new ArrayList<>();
        for (int i = 0; i < rowSize; i++) {
            LadderRow ladderRow = new LadderRow(columnSize);
            ladderRows.add(ladderRow);
        }
        ladder.settingColumns(ladderRows);
        return ladder;
    }

    private List<LadderRow> createLadderResult(List<Participant> participantInventory, List<String> trialResults){
        Ladder ladder = createLadder(participantInventory.size()-1);
        List<LadderRow> ladderRows = ladder.getRows();
        OutputView outputView = new OutputView();
        outputView.outputLadder(participantInventory, ladderRows, trialResults);
        return ladder.getRows();
    }

    public void playLadderGame(){
        Participants participants = createParticipants();
        List<Participant> participantInventory = participants.getParticipantInventory();
        List<String> trialResults = createResults();
        List<LadderRow> ladderRows = createLadderResult(participantInventory, trialResults);
        DecideResult decideResult = new DecideResult();
        decideResult.decideParticipantResult(participantInventory, ladderRows, trialResults);
        String participantName;
        do{
            participantName = inputView.inputParticipantToWantResult();
            outputView.outputParticipantResult(participants, participantName);
        }while(!participantName.equals("all"));
    }
}
