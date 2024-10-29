package view;

import model.Ladder;
import model.Row;

import java.util.List;

public class OutputView {
    private void outputLadderRow(List<Boolean> points) {
        System.out.print("|");
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i) == true) System.out.print("-----|");
            else if (points.get(i) == false) System.out.print("     |");
        }
        System.out.println();
    }

    public void outputLadder(Ladder ladder) {
        System.out.println("실행결과");
        List<Row> rows = ladder.getRows();
        for (int i = 0; i < ladder.getRowSize(); i++) {
            List<Boolean> points = rows.get(i).getPoints();
            outputLadderRow(points);
        }
    }
}
