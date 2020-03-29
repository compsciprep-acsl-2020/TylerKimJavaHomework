package w3resourceHomework;

import java.util.ArrayList;

public class Question20 {

    String firstInput;
    StringBuffer secondInput;

    public Question20(String firstInput, StringBuffer secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    public ArrayList<Boolean> compareCanonicalRepresentationOfStrings() {
        ArrayList<Boolean> output = new ArrayList<>();
        output.add(firstInput == secondInput.toString());
        output.add(firstInput == secondInput.toString().intern());


        return output;
    }

}
