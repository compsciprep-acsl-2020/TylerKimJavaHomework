package w3resourceHomework;

import java.util.ArrayList;

public class Question19 {
    String input;

    public Question19(String input) {
        this.input = input;
    }

    public ArrayList<Integer> characterIndexer() {
        char[] alphabet = "abcdefghijklmnopqurstuvwxyz".toCharArray();
        ArrayList<Integer> output = new ArrayList<>();
        String lowerCaseString = input.toLowerCase();

        for(int i = 0; i < alphabet.length; i++) {
            output.add(lowerCaseString.indexOf(alphabet[i]));
        }

        return output;
    }
}
