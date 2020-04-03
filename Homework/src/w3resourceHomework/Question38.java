package w3resourceHomework;

import java.util.ArrayList;

public class Question38 {

    public static void main(String args[]) {

        String input = "w3resource";
        System.out.println(removeRepeats(input));

    }
    
    public static String removeRepeats(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {

            if(doesCharacterRepeat(stringBuilder.toString(), input.substring(i, i+1))) {

            } else {
                stringBuilder.append(input.substring(i, i+1));
            }

        }

        return stringBuilder.toString();

    }

    //check repeating characters
    public static boolean doesCharacterRepeat(String currentSet, String letter) {
        for(int i = 0; i < currentSet.length(); i++) {

            if(letter.equals(currentSet.substring(i, i+1))) {
                return true;
            }

        }

        return false;
    }
}
