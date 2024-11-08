package model.ladder;

import java.util.ArrayList;
import java.util.List;

public class LadderRow {
    private List<Boolean> points = new ArrayList<>();

    public LadderRow(int columnSize) {
        for (int columnPosition = 0; columnPosition < columnSize; columnPosition++) {
            boolean randomBoolean = chooseTrueOrFalse(this.points, columnPosition);
            this.points.add(columnPosition, randomBoolean);
        }
    }

    private boolean chooseTrueOrFalse(List<Boolean> points, int columnPosition) {
        if (columnPosition == 0) {
            return Math.random() < 0.5;
        }
        if (points.get(columnPosition - 1) == true) return false;
        return Math.random() < 0.5;
    }

    public List<Boolean> getPoints() {
        return points;
    }
}
