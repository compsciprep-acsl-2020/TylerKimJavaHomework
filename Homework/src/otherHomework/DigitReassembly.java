package otherHomework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DigitReassembly {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<String> values = new ArrayList<>();
        List<String> length = new ArrayList<>();
        List<Integer> finalValues = new ArrayList<>();



        //Initiation
        System.out.println("Type your first five values that are less than 10^50 and then type your length right after each value:  ");
        System.out.println("e.g. 135135135 5 [ENTER] 13515165 7");

        //Seperate into values and lengths
        for(int i = 0; i < 1; i++) {
            String tempSet = input.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(tempSet, " ");
            values.add(stringTokenizer.nextToken());
            length.add(stringTokenizer.nextToken());
        }

        //find the final values
        for(int i = 0; i < 1; i ++) {
            int finalValue = 0;
            int lengthSize = Integer.parseInt(length.get(i));

            String[] splitValues = nCharacterSplitter(values.get(i), lengthSize);

            for(int x = 0; x < splitValues.length; x++) {
                int addingValue = Integer.parseInt(splitValues[x]);
                finalValue = finalValue + addingValue;
            }

            finalValues.add(finalValue);
        }

        System.out.println("Answer: " + finalValues);


    }

    public static String[] nCharacterSplitter(String input, int size) {
        List<String> parts = new ArrayList<>();

        for(int i = 0; i < input.length()-1; i++) {

            if(input.substring(i, Math.min(input.length(), i + size)).length() >= size) {
                parts.add(input.substring(i, Math.min(input.length(), i + size)));
            } else {
                break;
            }
        }
        return parts.toArray(new String[0]);
    }
}
