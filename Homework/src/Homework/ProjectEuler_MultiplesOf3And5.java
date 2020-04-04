package Homework;

import java.util.Scanner;

public class ProjectEuler_MultiplesOf3And5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Max Value: ");
        int maxNumber = input.nextInt();

        int sumOfNumbers = 0;

        //sum up all the values
        for(int i = 0; i < maxNumber; i = i + 1) {
            int isMultipleOfThree = multiplesOfThree(i);
            int isMultipleOfFive = multiplesOfFive(i);
            if(isMultipleOfThree != 0) {
                //test if multiple of three
                sumOfNumbers = sumOfNumbers + isMultipleOfThree;

            } else if(isMultipleOfFive != 0) {
                //test if multiple of five
                sumOfNumbers = sumOfNumbers + isMultipleOfFive;
            } else {
                //default
                sumOfNumbers = sumOfNumbers + 0;
            }
        }

        System.out.println(sumOfNumbers);

    }

    //test if value can be divided by 3
    public static int multiplesOfThree(int givenNumber) {
        int finalNumber = 0;

        if(givenNumber % 3 == 0) {
            finalNumber = givenNumber;

        } else {
            finalNumber = 0;
        }

        return finalNumber;
    }

    //test if value can be divided by 5
    public static int multiplesOfFive(int givenNumber) {
        int finalNumber = 0;

        if(givenNumber % 5 == 0) {
            finalNumber = givenNumber;

        } else {
            finalNumber = 0;
        }
        return finalNumber;
    }
}
