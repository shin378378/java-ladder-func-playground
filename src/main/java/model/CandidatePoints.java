package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandidatePoints {
    private List<Integer> candidateShufflePoints;

    public CandidatePoints(List<Integer> previousRows, int rowSize){
        candidateShufflePoints = createRowsExceptPreviousRows(previousRows, rowSize);
        Collections.shuffle(candidateShufflePoints);
    }

    private List<Integer> createRowsExceptPreviousRows(List<Integer> previousPoints, int lineLength) {
        List <Integer> PointsExpectPrevious = new ArrayList<>();
        for(int i=0; i<lineLength;i++){
            if(!previousPoints.contains(i)){
                PointsExpectPrevious.add(i);
            }
        }
        return PointsExpectPrevious;
    }

    public List<Integer> getCandidateShufflePoints() {
        return candidateShufflePoints;
    }
}
