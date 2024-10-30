package view;

import model.Participant;
import model.LadderRow;

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
            if (points.get(i) == true) System.out.print("-----|");
            else if (points.get(i) == false) System.out.print("     |");
        }
    }

    private void outputResults(List<String> trialResults) {
        System.out.println();
        for (String trialResult : trialResults) {
            System.out.printf("%" + COLUMN_LENGTH + "s", trialResult);
            System.out.printf(" ");
        }
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

    private void outputAllParticipantsResult(List<Participant> participantInventory) {
        for (Participant participant : participantInventory) {
            String participantName = participant.getName();
            String participantResult = participant.getResult();
            System.out.println(participantName + " : " + participantResult);
        }
    }

    private void outputCertainParticipantResult(List<Participant> participantInventory, String participantName) {
        for (Participant participant : participantInventory) {
            if (participantName.equals(participant.getName())) {
                String participantResult = participant.getResult();
                System.out.println(participantName + " : " + participantResult);
            }
        }
    }

    public void outputParticipantResult(List<Participant> participantInventory, String participantName) {
            System.out.println("\n" + "실행결과");
            if (participantName.equals("all")) {
                outputAllParticipantsResult(participantInventory);
                return;
            }
            outputCertainParticipantResult(participantInventory, participantName);
    }
}
