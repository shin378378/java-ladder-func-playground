package view;

import model.Participant;
import model.Row;

import java.util.List;

public class OutputView {
    private static final int COLUMN_LENGTH=5;
    private void outputParticipant(List<Participant> participantInventory){
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

    private void outputResults(List<String> trialResults){
        System.out.println();
        for (String trialResult : trialResults) {
            System.out.printf("%" + COLUMN_LENGTH + "s", trialResult);
            System.out.printf(" ");
        }
    }

    public void outputLadder(List<Participant> participantInventory, List<Row> rows, List<String> trialResults) {
        System.out.println("사다리 결과");
        System.out.println();
        outputParticipant(participantInventory);
        for (int i = 0; i < rows.size(); i++) {
            List<Boolean> points = rows.get(i).getPoints();
            outputLadderRow(points);
        }
        outputResults(trialResults);
    }


}
