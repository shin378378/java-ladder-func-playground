package model;

import java.util.List;

public class Ladder {
    private List<Row> rows;
    private int rowSize;

    public Ladder(int rowSize, int columnSize) {
        this.rowSize = rowSize;
    }

    public void settingColumns(List<Row> rows){
        this.rows = rows;
    }

    public int getRowSize() {
        return rowSize;
    }

    public List<Row> getRows() {
        return rows;
    }
}
