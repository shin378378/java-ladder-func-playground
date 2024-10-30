package model;

import java.util.List;

public class Participants {
    List<Participant> participantInventory;

    public Participants(List<Participant> participantInventory) {
        this.participantInventory = participantInventory;
    }

    public List<Participant> getParticipantInventory() {
        return participantInventory;
    }
}
