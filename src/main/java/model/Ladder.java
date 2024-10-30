package model;

import java.util.List;

public class Ladder {
    private List<LadderRow> ladderRows;

    public void settingColumns(List<LadderRow> ladderRows) {
        this.ladderRows = ladderRows;
    }

    public List<LadderRow> getRows() {
        return ladderRows;
    }
}
