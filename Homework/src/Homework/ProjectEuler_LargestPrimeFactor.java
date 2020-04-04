package Homework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProjectEuler_LargestPrimeFactor {

    public static void main(String args[]) {
        //Declare Variables
        Scanner input = new Scanner(System.in);
        List<Long> factors = new ArrayList<>();
        List<Long> primeFactors = new ArrayList<>();

        //Initiation
        System.out.println("Enter your value: ");
        long conditionValue = input.nextLong();

        //create list of factors
        for (long i = 3; i < (conditionValue - 1); i++) {
            long confirmedFactor = factorTester(i, conditionValue);

            if (confirmedFactor != 0) {
                factors.add(confirmedFactor);
            }
        }

        //create list of prime factors
        for(int i = 0; i < factors.size(); i++) {
            long confirmedValue = primeNumberTester(factors.get(i));

            if(confirmedValue != 0) {
                primeFactors.add(confirmedValue);

            }

        }

        long largestPrimeFactor = primeFactors.get((primeFactors.size()-1));

        System.out.println("List of Factors:  ");
        System.out.println(factors);

        System.out.println("List of Prime Factors: ");
        System.out.println(primeFactors);

        System.out.println("Largest Prime Factor:  ");
        System.out.println(largestPrimeFactor);
    }

    //test if value is a factor
    public static long factorTester(long hypothesizedValue, long conditionValue) {
        long factor = hypothesizedValue;

        if (conditionValue % hypothesizedValue == 0) {
            return factor;

        } else {

            return 0;
        }
    }


    //test if value is prime number
    public static long primeNumberTester(long hypothesis) {
        List<Long> testingSet = new ArrayList<>();

        for(long i = 2; i < hypothesis; i++) {
            testingSet.add(i);
        }

        for(int x = 0; x < testingSet.size(); x++) {
            long remainder = hypothesis % testingSet.get(x);

            if(remainder == 0) {
                return 0;

            } else if(x == (testingSet.size()-1)) {
               break;
            }
        }

        return hypothesis;
    }
}