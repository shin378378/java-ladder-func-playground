package model;

import java.util.List;

public class Ladder {
    private List<Column> columns;
    private int rowSize;
    private int columnSize;

    public Ladder(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
    }

    public void settingColumns(List<Column> columns){
        this.columns = columns;
    }

    public List<Column> getColumns() {
        return columns;
    }
}
