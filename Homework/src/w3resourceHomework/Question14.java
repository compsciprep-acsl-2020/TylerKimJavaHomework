package w3resourceHomework;

public class Question14 {

    String firstString;
    String secondString;

    public Question14(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;

    }

    public boolean compareStringsIgnoringCase() {
        boolean output = firstString.toLowerCase().equals(secondString.toLowerCase());

        return output;
    }

}
