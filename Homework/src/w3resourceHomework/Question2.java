package w3resourceHomework;

public class Question2 {
    String input;
    int index;

    public Question2(String input, int index) {
        this.input = input;
        this.index = index;
    }

    public int charAt() {
        Character output = input.charAt((int)index);
        int unicode = (int) output;

        return unicode;
    }


}
