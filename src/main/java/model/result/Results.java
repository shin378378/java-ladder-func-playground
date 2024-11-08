package model.result;

import java.util.List;

public class Results {
    private List<String> trialResults;

    public Results(List<String> trialResults) {
        this.trialResults = trialResults;
    }

    public List<String> getTrialResults() {
        return trialResults;
    }
}
