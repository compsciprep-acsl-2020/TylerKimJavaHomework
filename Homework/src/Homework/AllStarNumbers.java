package Homework;

import javafx.beans.property.IntegerProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AllStarNumbers {


    public static void main(String args[]) {

        String testInput = "20162017, 127";

        String[] inputArr = testInput.split(", ");
        String number = inputArr[0];
        String k = inputArr[1];

        System.out.println(findLargestPossibleNumbers(number));



    }

    //core methods
        //arrange numbers to find smallest value
    public static int findSmallestPossibleNumbers(String number) {

        ArrayList<Integer> dividedNumber = new ArrayList<>();

        for(int i = 0; i < number.length(); i++) {
            dividedNumber.add(Integer.parseInt(number.substring(i, i+1)));
        }

        Collections.sort(dividedNumber);

        return Integer.parseInt(convertToStringFromArrayListInt(dividedNumber));

    }

        //arrange numbers to find largest value
    public static int findLargestPossibleNumbers(String number) {

        ArrayList<Integer> dividedNumber = new ArrayList<>();

        for(int i = 0; i < number.length(); i++) {
            dividedNumber.add(Integer.parseInt(number.substring(i, i+1)));
        }

        Collections.sort(dividedNumber);
        Collections.reverse(dividedNumber);

        return Integer.parseInt(convertToStringFromArrayListInt(dividedNumber));

    }

    //supplementary methods
        //string of int arraylist
    public static String convertToStringFromArrayListInt(ArrayList<Integer> numberArray) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < numberArray.size(); i++) {
            stringBuilder.append(numberArray.get(i).toString());
        }

        return stringBuilder.toString();

    }

}
