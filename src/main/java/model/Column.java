package model;
import java.util.List;

public class Column {
    private int rowSize;
    private List<Integer> rows;

    public Column(int rowSize){
        this.rowSize= rowSize;
    }

    public void settingRows(List<Integer> shuffleRowsExceptPreviousRows){
        int numberOfRow = (int)(Math.random()*rowSize);
        this.rows = shuffleRowsExceptPreviousRows.subList(0,numberOfRow);
    }

    public List<Integer> getRows() {
        return rows;
    }
}
