package model.ladder;

import java.util.List;

public class Ladder {
    private List<LadderRow> ladderRows;

    public Ladder(List<LadderRow> ladderRows) {
        this.ladderRows = ladderRows;
    }

    public List<LadderRow> getRows() {
        return ladderRows;
    }
}
