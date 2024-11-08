package view;

import model.Participant;
import model.LadderRow;
import model.Participants;

import java.util.List;

public class OutputView {
    private static final int COLUMN_LENGTH = 5;

    private void outputParticipant(List<Participant> participantInventory) {
        for (Participant participant : participantInventory) {
            String participantName = participant.getName();
            System.out.printf("%" + COLUMN_LENGTH + "s", participantName);
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

    public void outputLadder(List<Participant> participantInventory, List<LadderRow> ladderRows, List<String> trialResults) {
        System.out.println("\n"+"사다리 결과"+"\n");
        outputParticipant(participantInventory);
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

    private void outputAllParticipantsResult(List<Participant> participantInventory) {
        for (Participant participant : participantInventory) {
            String participantName = participant.getName();
            String participantResult = participant.getResult();
            System.out.println(participantName + " : " + participantResult);
        }
    }

    private void outputCertainParticipantResult(Participants participants, String participantName) {
        String participantResult = participants.getCertainParticipantResult(participantName);
        if(participantResult==null){
            System.out.println("존재하지 않는 사용자입니다.");
        }
        else if(participantResult!=null){
            System.out.println(participantName + " : " + participantResult);
        }
    }

    public void outputParticipantResult(Participants participants, String participantName) {
            System.out.println("\n" + "실행결과");
            if (participantName.equals("all")) {
                outputAllParticipantsResult(participants.getParticipantInventory());
                return;
            }
            outputCertainParticipantResult(participants, participantName);
    }
}
