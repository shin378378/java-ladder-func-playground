package controller;

import model.Splitter;
import model.Participant;
import model.Participants;
import model.Results;
import model.Ladder;
import model.Row;

import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {
    InputView inputView = new InputView();
    Splitter splitter = new Splitter();

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

    private Results createResults() {
        String trialResultsBeforeSplit = inputView.inputResults();
        String[] trialResults = splitter.split(trialResultsBeforeSplit);
        Results results = new Results(Arrays.asList(trialResults));

        return results;
    }

    private Ladder createLadder(int columnSize) {
        int rowSize = inputView.inputLadderHeight();
        Ladder ladder = new Ladder(rowSize);
        List<Row> rows = new ArrayList<>();
        for (int i = 0; i < rowSize; i++) {
            Row row = new Row(columnSize);
            rows.add(row);
        }
        ladder.settingColumns(rows);
        return ladder;
    }

    public void createLadderResult(){
        Participants participants = createParticipants();
        List<Participant> participantInventory = participants.getParticipantInventory();
        Results results = createResults();
        List<String> trialResults = results.getTrialResults();
        Ladder ladder = createLadder(participantInventory.size()-1);
        OutputView outputView = new OutputView();
        List<Row> rows = ladder.getRows();
        outputView.outputLadder(participantInventory, rows, trialResults);
    }
}
