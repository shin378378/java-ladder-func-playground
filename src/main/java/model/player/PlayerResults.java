package model.player;

import java.util.Map;

public class PlayerResults {
    private Map<String, String> PlayerResultsInventory;

    public PlayerResults(Map<String, String> playerResultsInventory) {
        PlayerResultsInventory = playerResultsInventory;
    }

    public String getPlayerResult(String playerName) {
        return PlayerResultsInventory.get(playerName);
    }

    public Map<String, String> getPlayerResultsInventory() {
        return PlayerResultsInventory;
    }
}
