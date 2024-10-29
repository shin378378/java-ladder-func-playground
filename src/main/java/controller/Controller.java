package controller;

import model.Participant;
import model.Participants;
import model.Results;
import model.Splitter;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {
    InputView inputView = new InputView();
    Splitter splitter = new Splitter();

    public Participants createParticipants() {
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

    public Results createResults(){
        String trialResultsBeforeSplit = inputView.inputResults();
        String[] trialResults = splitter.split(trialResultsBeforeSplit);
        Results results = new Results(Arrays.asList(trialResults));

        return results;
    }

    //public void createLadder() {
//        int columnSize = inputView.inputLadderWidth();
//        int rowSize = inputView.inputLadderHeight();
//        Ladder ladder = new Ladder(rowSize, columnSize);
//        List<Row> rows = new ArrayList<>();
//        for(int i=0; i< rowSize; i++){
//            Row row = new Row(columnSize);
//            rows.add(row);
//        }
//        ladder.settingColumns(rows);
//        outputView.outputLadder(ladder);
    //}
}
