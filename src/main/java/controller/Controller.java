package controller;

import model.Ladder;
import model.Row;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void createLadder() {
        int columnSize = inputView.inputLadderWidth();
        int rowSize = inputView.inputLadderHeight();
        Ladder ladder = new Ladder(rowSize, columnSize);
        List<Row> rows = new ArrayList<>();
        for(int i=0; i< rowSize; i++){
            Row row = new Row(columnSize);
            rows.add(row);
        }
        ladder.settingColumns(rows);
        outputView.outputLadder(ladder);
    }
}
