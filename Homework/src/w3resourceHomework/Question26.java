package w3resourceHomework;

public class Question26 {

    String input;
    String testingValue;

    public Question26(String input, String testingValue) {
        this.input = input;
        this.testingValue = testingValue;
    }

    public boolean testIfStartWithString() {
        boolean output = input.startsWith(testingValue);

        return output;
    }
}
