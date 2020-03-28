package w3resourceHomework;

public class Question12 {

    String comparaton;
    String comparator;

    public Question12(String comparaton, String comparator) {
        this.comparaton = comparaton;
        this.comparator = comparator;

    }

    public boolean containerTest() {
        int comparatorLength = comparator.length();
        int comparatonLength = comparaton.length();

        if(comparaton.substring((comparatonLength - comparatorLength), comparatonLength).equals(comparator)) {
            return true;
        } else {
            return false;
        }
    }




}
