package Homework;

import javafx.beans.property.IntegerProperty;

import java.util.ArrayList;

public class AllStarAdjacent {

    public static void main(String[] args) {

        String test = "3, 11, 1, 4";
        String[] arr = test.split(", ");

        ArrayList<ArrayList<Integer>> getFractionWithCommonDenominator = formCommonDenominator(formFractionValues(arr));

        //test if denominators are equal
        if(Integer.parseInt(arr[1]) == Integer.parseInt(arr[3])) {
            System.out.println("1, ");
            System.out.println(arr[3]);

        } else {
            System.out.println("1, ");
            System.out.println(simplifyAndGetNDenominator(getFractionWithCommonDenominator));

        }


    }

    //core methods
        //get fractions
    public static ArrayList<ArrayList<Integer>> formFractionValues(String[] arr) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<Integer> firstFraction = new ArrayList<>();
        ArrayList<Integer> secondFraction = new ArrayList<>();

        firstFraction.add(Integer.parseInt(arr[0]));
        firstFraction.add(Integer.parseInt(arr[1]));

        secondFraction.add(Integer.parseInt(arr[2]));
        secondFraction.add(Integer.parseInt(arr[3]));

        output.add(firstFraction);
        output.add(secondFraction);

        return output;
    }

        //conform fractions to common denominator
    public static ArrayList<ArrayList<Integer>> formCommonDenominator(ArrayList<ArrayList<Integer>> fractions) {
        ArrayList<Integer> firstFraction = fractions.get(0);
        ArrayList<Integer> secondFraction = fractions.get(1);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        int firstFractionDenominator = firstFraction.get(1);
        int secondFractionDenominator = secondFraction.get(1);

        //first fraction
        for(int i = 0; i < firstFraction.size(); i++) {
            firstFraction.set(i, (firstFraction.get(i) * secondFractionDenominator));
        }

        //second fraction
        for(int i = 0; i < secondFraction.size(); i++) {
            secondFraction.set(i, (secondFraction.get(i) * firstFractionDenominator));
        }

        output.add(firstFraction);
        output.add(secondFraction);

        return output;
    }

        //simplifier
    public static int simplifyAndGetNDenominator(ArrayList<ArrayList<Integer>> fractions) {
        ArrayList<Integer> firstFraction = fractions.get(0);
        ArrayList<Integer> secondFraction = fractions.get(1);


        outerStatement:
        if(Math.abs(firstFraction.get(0) - secondFraction.get(0)) == 1) {
            return firstFraction.get(1);

        } else {
            for(int i = 2; i < firstFraction.get(1); i++) {
                if(isFractionDivisible(firstFraction, i) && isFractionDivisible(secondFraction, i)) {

                    //first fraction
                    for(int x = 0; x < firstFraction.size(); x++) {
                        firstFraction.set(x, (firstFraction.get(x) / i));
                    }

                    //second fraction
                    for(int x = 0; x < secondFraction.size(); x++) {
                        secondFraction.set(x, (secondFraction.get(x) / i));

                    }

                    break outerStatement;

                }
            }


        }

        return 1;

    }

    //supplementary methods
        //test if division is possible
    public static boolean isFractionDivisible(ArrayList<Integer> fraction, int value) {

        if((fraction.get(0) % value) == 0 && (fraction.get(1) % value) == 0) {
            return true;
        } else {
            return false;
        }

    }

}
