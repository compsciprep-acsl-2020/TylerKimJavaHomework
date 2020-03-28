package w3resourceHomework;

public class Question10 {

    String firstComparaton;
    StringBuffer secondComparaton;

    public Question10(String firstComparaton, StringBuffer secondComparaton) {
        this.firstComparaton = firstComparaton;
        this.secondComparaton = secondComparaton;
    }

    public boolean compareStringBuffer() {
        boolean output = firstComparaton.equals(secondComparaton.toString());

        return output;
    }


}
