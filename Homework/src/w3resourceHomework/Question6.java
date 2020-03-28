package w3resourceHomework;

public class Question6 {
    String firstComparaton;
    String secondComparaton;

    public Question6(String firstComparaton, String secondComparaton) {
        this.firstComparaton = firstComparaton;
        this.secondComparaton = secondComparaton;
    }

    public String lexicographicalComparatorWithoutCaseDifference() {
        if(firstComparaton.toLowerCase().compareTo(secondComparaton.toLowerCase()) > 0) {
            return firstComparaton + " is greater than " + secondComparaton;

        } else if(firstComparaton.toLowerCase().compareTo(secondComparaton.toLowerCase()) < 0) {
            return firstComparaton + " is less than " + firstComparaton;

        } else {
            return firstComparaton + " is equal to " + secondComparaton;
        }
    }
}
