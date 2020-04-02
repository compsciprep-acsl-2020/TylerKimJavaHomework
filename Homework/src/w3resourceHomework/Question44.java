package w3resourceHomework;

import java.util.ArrayList;

public class Question44 {

    public static void main(String args[]) {

        String input = "the quick brown fox jumps";

        System.out.println(inverseString(convertStringToArrayList(input)));

    }

    //convert to array list
    public static ArrayList<String> convertStringToArrayList(String input) {
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < input.length(); i++) {
            output.add(input.substring(i, i+1));
        }

        return output;
    }

    //inverse a string
    public static String inverseString(ArrayList<String> input) {
        ArrayList<String> inversedString = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        //inverse a string with arraylist
        for(int i = input.size()-1; i >= 0; i--) {
            inversedString.add(input.get(i));
        }

        //convert to string
        for(int i = 0; i < inversedString.size(); i++) {
            stringBuilder.append(inversedString.get(i));
        }

        return stringBuilder.toString();
    }
}
