package model.player;

import java.util.List;

public class Players {
    private List<Player> playerInventory;

    public Players(List<Player> playerInventory) {
        this.playerInventory = playerInventory;
    }

    public List<Player> getPlayerInventory() {
        return playerInventory;
    }
}
