package model;

import java.util.ArrayList;
import java.util.List;

public class Participants {
    List<Participant> participantInventory;

    public Participants(List<Participant> participantInventory) {
        this.participantInventory = participantInventory;
    }

    public List<Participant> getParticitantList() {
        return participantInventory;
    }
}
