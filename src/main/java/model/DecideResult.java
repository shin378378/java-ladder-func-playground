package model;

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

    public void decideParticipantResult(List<Participant> participantInventory, List<LadderRow> ladderRows, List<String> trialResults){
        for (Participant participant : participantInventory) {
            int participantPosition = participant.getPosition();
            int columnPosition = moveRow(ladderRows, participantPosition);
            String result = trialResults.get(columnPosition);
            participant.settingResult(result);
        }
    }
}
