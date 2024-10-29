package model;

import java.util.List;

public class Ladder {
    private List<Row> columns;
    private int rowSize;
    private int columnSize;

    public Ladder(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
    }
}
