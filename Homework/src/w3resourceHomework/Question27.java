package w3resourceHomework;

public class Question27 {

    String input;
    int firstValue;
    int secondValue;

    public Question27(String input, int firstValue, int secondValue) {
        this.input = input;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public String stringFromGivenRange() {
        String output = input.substring(firstValue, secondValue);

        return "old = " + input + "\nnew = " + output;
    }

}
