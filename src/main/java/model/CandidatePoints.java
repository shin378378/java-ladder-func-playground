package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandidatePoints {
    private List<Integer> candidateShufflePoints;

    private List<Integer> createRowsExceptPreviousRows(List<Integer> previousPoints, int lineLength) {
        List <Integer> PointsExpectPrevious = new ArrayList<>();
        for(int i=0; i<lineLength;i++){
            if(!previousPoints.contains(i)){
                PointsExpectPrevious.add(i);
            }
        }
        return PointsExpectPrevious;
    }

    public List<Integer> createSufflePoints(List<Integer> previousRows, int rowSize){
        candidateShufflePoints = createRowsExceptPreviousRows(previousRows, rowSize);
        Collections.shuffle(candidateShufflePoints);
        return candidateShufflePoints;
    }

    public List<Integer> getCandidateShufflePoints() {
        return candidateShufflePoints;
    }
}
