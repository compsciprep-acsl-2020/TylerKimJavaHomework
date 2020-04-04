package Homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Duplicates {

    public static void main(String args[]) {

        //test
        String input = "ABRACADABRACABOB";

        //sorts the collection in alphabetical order
        ArrayList<String> Letters = letters(input);
        Collections.sort(Letters);

        //gets the auxiliary array
        ArrayList<Integer> auxiliary = auxiliary(Letters, input);

        ArrayList<ArrayList<String>> additionResult = ADD(Letters, auxiliary, "BATH");
        System.out.println(additionResult.get(0));
        System.out.println(additionResult.get(1));

        ArrayList<ArrayList<String>> subtractionResult = DELETE(additionResult.get(0), stringToIntegerArrayList(additionResult.get(1)), "BOA");

        System.out.println(" ");

        System.out.println(subtractionResult.get(0));
        System.out.println(subtractionResult.get(1));


    }

    //initialization methods
        //get character arraylist
    public static ArrayList<String> letters(String input) {

        ArrayList<String> lettersOutput = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            if(sameLetterFinder(lettersOutput, input.substring(i, i+1))) {

            } else {
                lettersOutput.add(input.substring(i, i+1));
            }
        }

        return lettersOutput;
    }

        //get auxiliary arraylist
    public static ArrayList<Integer> auxiliary(ArrayList<String> letter, String input) {
        ArrayList<Integer> output = new ArrayList<>();
        int tempValue = 0;

        for(int i = 0; i < letter.size(); i++) {
            tempValue = 0;

            for(int j = 0; j < input.length(); j++) {
                if(input.substring(j, j+1).equals(letter.get(i))) {
                    tempValue++;
                }
            }

            output.add(tempValue);

        }

        return output;

    }


    //command methods
        //add
    public static ArrayList<ArrayList<String>> ADD(ArrayList<String> letters, ArrayList<Integer> auxiliary, String addedLetters) {

        for(int i = 0; i < addedLetters.length(); i++) {

                if(sameLetterFinder(letters, addedLetters.substring(i, i+1))) {
                    int x = (auxiliary.get(letters.indexOf(addedLetters.substring(i, i+1))));
                    auxiliary.set(letters.indexOf(addedLetters.substring(i, i+1)), x + 1);

                } else {
                    auxiliary.add(1);
                    letters.add(addedLetters.substring(i, i+1));

                }


        }

        return reorderLetterAndAuxiliary(letters, auxiliary);
    }
        //delete
    public static ArrayList<ArrayList<String>> DELETE(ArrayList<String> letters, ArrayList<Integer> auxiliary, String deletedLetters) {

        for(int i = 0; i < deletedLetters.length(); i++) {
            int x = auxiliary.get(letters.indexOf(deletedLetters.substring(i, i+1))) - 1;
            auxiliary.set(letters.indexOf(deletedLetters.substring(i, i+1)), x);
        }

        return purgeCounterAndLetter(letters, auxiliary);

    }


    //supplementary methods
        //find if the letters in an array and the given are the same
    public static boolean sameLetterFinder(ArrayList<String> letters, String letter) {

        for(int i = 0; i < letters.size(); i++) {

            if(letters.get(i).equals(letter)) {
                return true;
            }

        }

        return false;

    }

        //convert integer array list to string arraylist
    public static ArrayList<String> integerToStringArrayList(ArrayList<Integer> integerArr) {
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < integerArr.size(); i++) {
            output.add(integerArr.get(i).toString());
        }

        return output;
    }

        //convert string array to integer array
    public static ArrayList<Integer> stringToIntegerArrayList(ArrayList<String> stringArr) {
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < stringArr.size(); i++) {
            output.add(Integer.parseInt(stringArr.get(i)));
        }

        return output;

    }


        //reorder the auxiliary to that of the letter collection
    public static ArrayList<ArrayList<String>> reorderLetterAndAuxiliary(ArrayList<String> letters, ArrayList<Integer> auxiliary) {
        ArrayList<ArrayList<String>> output = new ArrayList<>();
        ArrayList<Integer> orderedAuxiliary = new ArrayList<>();
        ArrayList<String> tempLetters = new ArrayList<>();

        //reorder letters to a temp variable
        for(int i = 0; i < letters.size(); i++) {
            tempLetters.add(letters.get(i));
        }
        Collections.sort(tempLetters);

        //reorder auxiliary
        for(int i = 0; i < tempLetters.size(); i++) {
            orderedAuxiliary.add(auxiliary.get(letters.indexOf(tempLetters.get(i))));
        }



        output.add(tempLetters);
        output.add(integerToStringArrayList(orderedAuxiliary));

        return output;

    }

        //clean out zero counters
    public static ArrayList<ArrayList<String>> purgeCounterAndLetter(ArrayList<String> letters, ArrayList<Integer> auxiliary) {
        ArrayList<ArrayList<String>> output = new ArrayList<>();

        for(int i = 0; i < auxiliary.size(); i++) {
            if(auxiliary.get(i) == 0) {
                auxiliary.remove(i);
                letters.remove(i);
            }
        }

        output.add(letters);
        output.add(integerToStringArrayList(auxiliary));

        return output;

    }

}
