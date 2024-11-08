package model.ladder;

import model.player.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ladder {
    private List<LadderRow> ladderRows;
    private List<String> ladderResults;

    public Ladder(List<LadderRow> ladderRows, List<String> ladderResults) {
        this.ladderRows = ladderRows;
        this.ladderResults = ladderResults;
    }

    private LadderMove changePosition(List<Boolean> points, int columnPosition) {
        if (columnPosition > 0 && points.get(columnPosition - 1)) {
            return LadderMove.LEFT;
        }
        if (columnPosition < points.size() && points.get(columnPosition)) {
            return LadderMove.RIGHT;
        }
        return LadderMove.DOWN;
    }

    private int moveColumn(List<Boolean> points, int columnPosition) {
        LadderMove moveDirection = changePosition(points, columnPosition);
        return columnPosition + moveDirection.getOffset();
    }

    private int moveRow(List<LadderRow> ladderRows, int columnPosition) {
        for (LadderRow ladderRow : ladderRows) {
            List<Boolean> points = ladderRow.getPoints();
            columnPosition = moveColumn(points, columnPosition);
        }
        return columnPosition;
    }

    public Map<String, String> decidePlayerResults(List<Player> playerInventory) {
        Map<String, String> playerResultsInventory = new HashMap<>();
        for (Player player : playerInventory) {
            int playerPosition = player.getPosition();
            int columnPosition = moveRow(ladderRows, playerPosition);
            String playerName = player.getName();
            String playerResult = ladderResults.get(columnPosition);
            playerResultsInventory.put(playerName, playerResult);
        }
        return playerResultsInventory;
    }

    public List<LadderRow> getLadderRows() {
        return ladderRows;
    }

    public List<String> getLadderResults() {
        return ladderResults;
    }
}
