package model;

import java.util.List;

public class Ladder {
    private List<LadderRow> ladderRows;
    private int rowSize;

    public Ladder(int rowSize) {
        this.rowSize = rowSize;
    }

    public void settingColumns(List<LadderRow> ladderRows) {
        this.ladderRows = ladderRows;
    }

    public List<LadderRow> getRows() {
        return ladderRows;
    }

    public int getRowSize() {
        return rowSize;
    }
}
