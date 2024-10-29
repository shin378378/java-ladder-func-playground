package controller;

import model.CandidatePoints;
import model.Ladder;
import model.Column;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Integer> settingPreviousRow(List<Column> columns, int columnNumber){
        List <Integer> previousRows = null;
        if(columnNumber!=0){
            previousRows = columns.get(columnNumber-1).getRows();
        }
        return previousRows;
    }

    private List<Column> createColumns(int rowSize, int columnSize){
        List<Column> columns = new ArrayList<>();
        for (int i = 0; i < columnSize; i++) {
            List <Integer> previousRows = settingPreviousRow(columns, i);
            CandidatePoints candidatePoints = new CandidatePoints(previousRows, rowSize);
            List<Integer> candidateShufflePoints = candidatePoints.getCandidateShufflePoints();
            Column column = new Column(candidateShufflePoints);
            columns.add(column);
        }
        return columns;
    }

    public void createLadder(int rowSize, int columnSize) {
        Ladder ladder = new Ladder(rowSize, columnSize);
        List<Column> columns = createColumns(rowSize, columnSize);
        ladder.settingColumns(columns);
    }
}
