package otherHomework;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ascending {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<Integer> currentInt = new ArrayList<>();
        List<String> currentString = new ArrayList<>();
        List<Integer> outputValue = new ArrayList<>();
        List<String> inverseStringArray = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        //Initiation
        System.out.println("ACSL Ascending Program");
        System.out.println("Type in Input:");
        System.out.println("ex. 1314159265");
        String inputValue = input.next();

        //Change to Array List
        for(int i = 0; i < inputValue.length(); i++) {
            currentInt.add(Integer.parseInt(inputValue.substring(i, i+1)));
        }

        for(int x = 0; x < inputValue.length(); x++) {
            currentString.add(inputValue.substring(x, x+1));
        }

        int d = currentInt.get(0);
        currentInt.remove(0);

        //Start composing the final output
        outputValue.add(firstValue(d, inputValue));

        for(int y = 0; y < d; y++) {
            currentInt.remove(y);
        }

        //Inverse Value
        inverseStringArray = inverseString(currentInt);

        //Compose the Rest of the final output
        while(true) {
            stringBuilder.setLength(0);

           for(int x = 0; x < inverseStringArray.size(); x++) {
               stringBuilder.append(inverseStringArray.get(x));
           }

           String currentStringInForm = stringBuilder.toString();
           try {
               int testingValue = Integer.parseInt(currentStringInForm.substring(0, d));


               //greater
               if(testingValue > outputValue.get(outputValue.size()-1)) {
                   outputValue.add(testingValue);

                   for(int x = 0; x < d && x < inverseStringArray.size(); x++) {
                       inverseStringArray.remove(0);
                   }

               } else  {   //less
                   d++;
               }
           } catch(IndexOutOfBoundsException e) {
               break;
           }


        }
        System.out.println(outputValue);

    }

    //Find inverse String
    public static List<String> inverseString( List<Integer> inputInteger) {
        List<String> inverseString = new ArrayList<>();

        for(int i = inputInteger.size() - 1; i >= 0; i--) {
            inverseString.add(inputInteger.get(i).toString());
        }

        return inverseString;
    }

    //add first value
    public static int firstValue (int d, String inputValue) {

        String firstValue = inputValue.substring(1, d + 1);

        return Integer.parseInt(firstValue);
    }
}
