package model;

public class Participant {
    private static final int NAME_LENGTH_LIMIT=5;
    private int position;
    private String name;
    private String result;

    public Participant(int position, String name) {
        if(name.length()> NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException("참가자 이름이 "+NAME_LENGTH_LIMIT+"자 초과입니다.");
        }
        this.position = position;
        this.name = name;
    }

    public void settingResult(String result){
        this.result = result;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }
}
