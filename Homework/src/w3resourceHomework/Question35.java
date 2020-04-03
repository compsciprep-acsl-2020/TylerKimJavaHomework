package w3resourceHomework;

import java.util.ArrayList;

public class Question35 {

    public static void main(String args[]) {

        String input = "PQR";
        System.out.println("The permuted strings are: " + permuteString(input));
    }

    public static ArrayList<String> permuteString(String input) {
        char[] reference = input.toCharArray();
        ArrayList<String> permutations = new ArrayList<>();


        //first layer
        for(int i = 0; i < reference.length; i++) {

            //second layer
            for(int j = 0; j < reference.length; j++) {

                //third layer
                for(int k = 0; k < reference.length; k++) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(reference[i]);
                    stringBuilder.append(reference[j]);
                    stringBuilder.append(reference[k]);
                    permutations.add(stringBuilder.toString());

                }

            }

        }

        return  permutations;

    }

}
