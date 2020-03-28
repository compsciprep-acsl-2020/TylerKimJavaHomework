package w3resourceHomework;


public class Question1 {

    String input;
    int index;

    public Question1(String input, int index) {
        this.input = input;
        this.index  = index;
    }

    public Character charAt() {
        Character output = input.charAt(index);
        return output;
    }

}
