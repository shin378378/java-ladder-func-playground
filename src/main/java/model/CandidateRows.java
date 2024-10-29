package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandidateRows {
    private List<Integer> shuffleRowsExceptPreviousRows;

    private List<Integer> createRowsExceptPreviousRows(List<Integer> previousRows, int rowSize) {
        List <Integer> rowsExceptPreviousRows = new ArrayList<>();
        for(int i=0; i<rowSize;i++){
            if(!previousRows.contains(i)){
                rowsExceptPreviousRows.add(i);
            }
        }
        return rowsExceptPreviousRows;
    }

    private List<Integer> createSuffleRowsExceptPreviousRows(List<Integer> previousRows, int rowSize){
        shuffleRowsExceptPreviousRows = createRowsExceptPreviousRows(previousRows, rowSize);
        Collections.shuffle(shuffleRowsExceptPreviousRows);
        return shuffleRowsExceptPreviousRows;
    }

    public List<Integer> getCandidateRows() {
        return shuffleRowsExceptPreviousRows;
    }
}
