package w3resourceHomework;

import java.util.ArrayList;

public class Question49 {

    public static void main(String args[]) {

        String input = "godisgood";
        findRepeatingString(input);



    }

    public static String findRepeatingString(String input) {
        ArrayList<String> currentSet = new ArrayList<>();
        int index = 0;

        //get first value
        currentSet.add(input.substring(0,1));

        //run stream
        for(int i = 1; i < input.length()-1; i++) {

            if (!doesCharacterRepeat(currentSet, input.substring(i, i+1))) {
                currentSet.add(input.substring(i, i+1));
                System.out.println("Reading: " + input.substring(i, i+1));
                System.out.println("The first non-repeating character so far is: " + currentSet.get(index));

            } else {
                index++;
                System.out.println("Reading: " + input.substring(i, i+1));
                System.out.println("The first non-repeating character so far is: " + currentSet.get(index));
            }
        }
        return input;

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
