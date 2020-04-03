package w3resourceHomework;

import java.util.ArrayList;

public class Question55 {

    public static void main(String args[]) {

        String initialInput = "aabaarbarccrabmq";

        System.out.println("The given String is: " + initialInput);
        System.out.println("The new string after removing all adjacent duplicates is: ");
       ArrayList<String> input = adjacentDuplicatesRemover(initialInput);

        while(input.get(1).equals("0")) {
            initialInput = input.get(0);

            input = adjacentDuplicatesRemover(initialInput);


        }

        System.out.println(initialInput);

    }



    //duplicate remover
    public static ArrayList<String> adjacentDuplicatesRemover(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> output = new ArrayList<>();
        String isDone = "1";

        for(int i = 0; i < input.length()-1; i++) {
            if(areStringsEqual(input.substring(i, i+1), input.substring(i + 1, i + 2))) {
                i++;
                isDone = "0";
            } else {
                stringBuilder.append(input.substring(i, i+1));
            }
        }

        stringBuilder.append(input.substring(input.length()-1, input.length()));
        output.add(stringBuilder.toString());
        output.add(isDone);

        return output;
    }

    //compare strings
    public static boolean areStringsEqual(String firstString, String secondString) {

        if(firstString.equals(secondString)) {
            return true;
        }
        return false;

    }

}
