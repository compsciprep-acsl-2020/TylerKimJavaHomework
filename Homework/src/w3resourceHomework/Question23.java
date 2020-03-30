package w3resourceHomework;

import java.util.ArrayList;

public class Question23 {

    String input1;
    String input2;

    public Question23(String input1, String input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public ArrayList<Boolean> stringMatcher() {
        ArrayList<Boolean> output = new ArrayList<>();
       boolean firstPart = input1.regionMatches(0, input2, 28, 8);
       boolean secondPart = input1.regionMatches(9, input2, 9, 6);

       output.add(firstPart);
       output.add(secondPart);

       return output;
    }
}
