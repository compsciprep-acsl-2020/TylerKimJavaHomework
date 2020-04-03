package w3resourceHomework;

import java.util.ArrayList;

public class Question34 {

    public static void main(String args[]) {

        String input = "successes";

        System.out.println("The given string is: " + input);

        System.out.println("The second most frequent char in the string is: " + secondLargestString(getAllAlphabeticalCharactersOfString(input)));

    }

    public static String secondLargestString(ArrayList<Integer> alphabetCount) {
        //find largest value
        alphabetCount.remove(maxValueIndex(alphabetCount));

        int asciiValue = maxValueIndex(alphabetCount) + 65;

        return Character.toString(asciiValue);
    }

    //alphabetical characters
    public static ArrayList<Integer> getAllAlphabeticalCharactersOfString(String input) {
        ArrayList<Integer> counterResult = new ArrayList<>();
        char[] alphabet = "abcdefghijklmnoqurstuvwxyz".toCharArray();
        int counter = 0;

        for(int i = 0; i < alphabet.length; i++) {
            counter = 0;
            for(int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == (alphabet[i])) {
                    counter++;
                }
            }
            counterResult.add(counter);
        }

        return counterResult;
    }

    //find max value index
    public static int maxValueIndex(ArrayList<Integer> input) {
        int max = 0;

        for(int i = 0; i < input.size(); i++) {
            if(input.get(i) > max) {
                max = input.get(i);
            }
        }

        int indexOutput = input.indexOf(max);

        return indexOutput;

    }
}
