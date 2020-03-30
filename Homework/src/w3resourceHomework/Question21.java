package w3resourceHomework;

import java.util.ArrayList;

public class Question21 {

    String input;

    public Question21(String input) {
        this.input = input;
    }

    public ArrayList<Integer> lastIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i < alphabet.length; i++) {
            String alphabetLetter = String.valueOf(alphabet[i]);
            arrayList.add(input.lastIndexOf(alphabetLetter));
        }

        return arrayList;
    }
}
