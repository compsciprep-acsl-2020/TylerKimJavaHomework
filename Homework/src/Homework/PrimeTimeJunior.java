package Homework;

import java.util.ArrayList;

public class PrimeTimeJunior {

    public static void main(String args[]) {

        String input = "17";

        System.out.println(isPrime(Integer.parseInt(input)));

    }



    //supplementary methods
        //prime number finder
    public static boolean isPrime(int number) {

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

        //rotate numbers
    public static int rotate(String number) {
        ArrayList<String> numberToArray = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        int x = 0;

        //add first element
        output.add(numberToArray.get(0));

        for(int i = 1; i < numberToArray.size(); i++) {
            output.add(0, numberToArray.get(i));
        }

        output = inverseArr(output);

        //make new int
        for(int i = 0; i < output.size(); i++) {

            x += Integer.parseInt(output.get(i)) + ((i+1) * 10);


        }

        return x;

    }

        //inverse arraylist
    public static ArrayList<String> inverseArr(ArrayList<String> input) {
        ArrayList<String> inverseOutput = new ArrayList<>();

        for(int i = input.size(); i >= 0; i++) {
            inverseOutput.add(input.get(i));
        }

        return inverseOutput;
    }

}
