package model;

public class Move {
    final static int ROW_INITIAL_POSITION = 0;
    int rowPosition;
    int columnPosition;

    public void settingInitialPosition(int columnPosition) {
        this.rowPosition = ROW_INITIAL_POSITION;
        this.columnPosition = columnPosition;
    }
}
