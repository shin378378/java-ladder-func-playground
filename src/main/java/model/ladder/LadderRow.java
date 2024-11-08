package model.ladder;

import java.util.ArrayList;
import java.util.List;

public class LadderRow {
    private List<Boolean> points = new ArrayList<>();

    public LadderRow(int columnSize) {
        for (int columnPosition = 0; columnPosition < columnSize; columnPosition++) {
            boolean randomBoolean = chooseLadderPoint(columnPosition);
            this.points.add(columnPosition, randomBoolean);
        }
    }

    private LadderPoint randomTrueOrFalse() {
        if (Math.random() < 0.5) return LadderPoint.CONNECTED;
        return LadderPoint.DISCONNECTED;
    }

    public boolean chooseLadderPoint(int columnPosition) {
        if (columnPosition > 0 && points.get(columnPosition - 1))
            return LadderPoint.DISCONNECTED.getConnected();
        return randomTrueOrFalse().getConnected();

    }

    public List<Boolean> getPoints() {
        return points;
    }
}
