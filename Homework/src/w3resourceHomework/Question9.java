package w3resourceHomework;

public class Question9 {

    String firstComparaton;
    String secondcomparaton;

    public Question9(String firstComparaton, String secondcomparaton) {
        this.firstComparaton = firstComparaton;
        this.secondcomparaton = secondcomparaton;
    }

    public boolean compareString() {
        if(firstComparaton.compareTo(secondcomparaton) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
