package w3resourceHomework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question37 {

    public static void main(String args[]) {

        String input = "pickoutthelongestsubstring";

        ArrayList<String> initialValue = findFirstStandingValue(input);

        System.out.println("Input String: " + input);
        System.out.println("The longest substring: " + longestWithoutRepeat(input, initialValue));
        System.out.println("The longest Substring length: " + longestWithoutRepeat(input, initialValue).size());

    }

    //second and later
    public static ArrayList<String> longestWithoutRepeat(String input, ArrayList<String> firstStandingValue) {
        ArrayList<String> standingValue = firstStandingValue;
        ArrayList<String> tempValue = new ArrayList<>();

        for(int i = firstStandingValue.size()-1; i < input.length(); i++) {

            if(doesCharacterRepeat(tempValue, input.substring(i,i+1))) {
                standingValue = greaterLength(standingValue, tempValue);
                tempValue.clear();
            } else {
                tempValue.add(input.substring(i, i+1));
            }
        }

        return greaterLength(standingValue, tempValue);

    }

    //initial
    public static ArrayList<String> findFirstStandingValue(String input) {
        ArrayList<String> standingValueFirst = new ArrayList<>();

        for(int i = 0; i < input.length(); i++) {

            if(doesCharacterRepeat(standingValueFirst, input.substring(i, i+1))) {
                return standingValueFirst;
            } else {
                standingValueFirst.add(input.substring(i, i+1));
            }

        }

        return standingValueFirst;
    }

    public static boolean doesCharacterRepeat(ArrayList<String> currentSet, String letter) {
        for(int i = 0; i < currentSet.size(); i++) {

            if(letter.equals(currentSet.get(i))) {
                return true;
            }

        }

        return false;
    }

    //find which arraylist is longer
    public static ArrayList<String> greaterLength(ArrayList<String> standingValue, ArrayList<String> competitor) {
        if(standingValue.size() > competitor.size()) {
            return standingValue;
        } else {
            return competitor;
        }
    }
}
