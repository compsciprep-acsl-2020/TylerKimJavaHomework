package w3resourceHomework;

import java.util.ArrayList;

public class Question39 {

    public static void main(String args[]) {

        String input = "gibblegabbler";

        System.out.println("The given string is: " + input);
        System.out.println("The first non repeated character in String is: " + findRepeaters(input).get(0));

    }

    //get all non repeating values
    public static ArrayList<String> findRepeaters(String input) {
        ArrayList<String> nonRepeatingStringValue = new ArrayList<>();

        //put first value
        nonRepeatingStringValue.add(input.substring(0,1));

        for(int i = 1; i < input.length(); i++) {
            if(doesCharacterRepeat(nonRepeatingStringValue, input.substring(i, i+1))) {
                nonRepeatingStringValue.remove(input.substring(i, i+1));
            } else {
                nonRepeatingStringValue.add(input.substring(i, i+1));
            }
        }

        return nonRepeatingStringValue;

    }


    public static boolean doesCharacterRepeat(ArrayList<String> currentSet, String letter) {
        for(int i = 0; i < currentSet.size(); i++) {

            if(letter.equals(currentSet.get(i))) {
                return true;
            }

        }

        return false;
    }



}
