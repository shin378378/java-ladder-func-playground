package model;

public enum Move {
    RIGHT(-1),
    LEFT(1),
    DOWN(0);

    private final int offset;

    Move(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }
}
