package w3resourceHomework;

import java.util.ArrayList;

public class Question51 {

    public static void main(String args[]) {

        String input = "w3resource";
        ArrayList<Integer> alphabet = getAllAlphabeticalCharactersOfString(input);
        ArrayList<Integer> indices = indexOfRepeatingValues(alphabet);

        System.out.println("The given string is: " + input);
        System.out.println("The duplicate characters and counts are: ");


        for(int i = 0; i < indices.size(); i++) {
            System.out.println(Character.toString(indices.get(i) + 65) + " appears " + alphabet.get(indices.get(i)) + " times");


        }


    }

    //find index of repeating values
    public static ArrayList<Integer> indexOfRepeatingValues(ArrayList<Integer> alphabet) {
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < alphabet.size(); i++) {
            if(alphabet.get(i) > 1) {
                indices.add(i);
            }


        }
        return indices;

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

}
