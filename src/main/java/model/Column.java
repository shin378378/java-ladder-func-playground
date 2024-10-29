package model;

import java.util.List;

public class Column {
    private int rowLength;
    private List<Integer> points;

    public Column(List<Integer> candidateShufflePoints) {
        int numberOfPoint = (int) (Math.random() * candidateShufflePoints.size());
        this.points = candidateShufflePoints.subList(0, numberOfPoint);
    }

    public List<Integer> getRows() {
        return points;
    }
}
