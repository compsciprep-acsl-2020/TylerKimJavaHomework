package w3resourceHomework;

public class Question5 {
    String firstComparaton;
    String secondComparaton;

    public Question5(String firstComparaton, String secondComparaton) {
        this.firstComparaton = firstComparaton;
        this.secondComparaton = secondComparaton;
    }

    public String lexicographicalComparater() {
        if(firstComparaton.compareTo(secondComparaton) > 0) {
            return firstComparaton + " is greater than " + secondComparaton;

        } else if(firstComparaton.compareTo(secondComparaton) < 0) {
            return firstComparaton + " is less than " + firstComparaton;

        } else {
            return firstComparaton + " is equal to " + secondComparaton;
        }
    }
}
