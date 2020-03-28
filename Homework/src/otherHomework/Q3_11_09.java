package otherHomework;

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Q3_11_09 {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<String> inputValues = new ArrayList<>();
        List<String> finalValue = new ArrayList<>();

        //Initiation
        System.out.println("Type your values seperated by spaces: ");
        System.out.println("e.g 1 2 3 4 5");
        String inputString = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString, " ");

        //Create the input string
        while(stringTokenizer.hasMoreTokens()) {
            inputValues.add(stringTokenizer.nextToken());
        }

        finalValue = rotateLeft(inputValues);
        System.out.println(finalValue);

    }

    public static List<String> rotateLeft(List<String> input) {
        List<String> finalValues = new ArrayList<>();

        //add to new arraylist
        for(int i = 0; i < input.size() - 1; i++) {
            finalValues.add(input.get(i + 1));
        }

        finalValues.add(input.get(0));

        return finalValues;
    }
}
