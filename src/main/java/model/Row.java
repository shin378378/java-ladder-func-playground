package model;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Boolean> points = new ArrayList<>();
    private int columnSize;

    public Row(int columnSize) {
        this.columnSize = columnSize;
        for (int columnPosition = 0; columnPosition < columnSize; columnPosition++) {
            boolean randomBoolean = chooseTrueOrFalse(this.points, columnPosition);
            this.points.add(columnPosition, randomBoolean);
        }
    }

    private boolean chooseTrueOrFalse(List<Boolean> points, int columnPositon) {
        if (columnPositon == 0) {
            return Math.random() < 0.5;
        }
        if (points.get(columnPositon - 1) == true) return false;
        return Math.random() < 0.5;
    }

    public List<Boolean> getPoints() {
        return points;
    }

    public int getColumnSize() {
        return columnSize;
    }
}
