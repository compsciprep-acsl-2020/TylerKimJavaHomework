package w3resourceHomework;

public class Question13 {

    String firstString;
    String secondString;

    public Question13(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public boolean sameDataTester() {
        boolean output = firstString.equals(secondString);

        return output;
    }

}
