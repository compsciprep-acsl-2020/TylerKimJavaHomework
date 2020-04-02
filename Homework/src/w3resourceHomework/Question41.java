package w3resourceHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class Question41 {

    public static void main(String args[]) {

        String baseString = "the quick brown fox";
        String maskString = "queen";

        System.out.println(comparison(baseString, maskString));

    }

    //comparison
    public static String comparison(String baseString, String maskString) {
        char[] reference = maskString.toCharArray();
        char[] output = baseString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean addValue;

        for(int i = 0; i < output.length; i++) {

            addValue = true;

            for(int j = 0; j < reference.length; j++) {
                if(output[i] == reference[j]) {
                    addValue = false;
                }
            }

            if(addValue) {
                stringBuilder.append(output[i]);
            }
        }



        return stringBuilder.toString();
    }

    //convert to array list
    public static ArrayList<String> convertStringToArrayList(String input) {
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < input.length(); i++) {
            output.add(input.substring(i, i+1));
        }

        return output;
    }



}
