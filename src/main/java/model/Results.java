package model;

import java.util.List;

public class Results {
    List<String> trialResults;

    public Results(List<String> trialResults) {
        this.trialResults = trialResults;
    }

    public List<String> getTrialResults() {
        return trialResults;
    }
}
