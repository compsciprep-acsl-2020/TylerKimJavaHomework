package w3resourceHomework;

public class Question3 {
    String input;
    int index;

    public Question3(String input, int index) {
        this.input = input;
        this.index = index;
    }

    public int unicodeValueBeforeIndex() {
        int output = input.charAt((int)index - 1);

        return output;
    }

}
