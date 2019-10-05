import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class ProjectEuler_EvenFibonacciNumbers {
    public static void main(String args[]) {

        //Declare variables
        Scanner input = new Scanner(System.in);
        long sumValue = 0;

        //Initiation
        System.out.println("Enter max value: ");
        long maxValue = input.nextLong();
        List<Long> fibonacciNumbers = new ArrayList<Long>();
        fibonacciNumbers.add(1L);
        fibonacciNumbers.add(2L);

        //find all fibonacci numbers
        for(int i = 2;i < maxValue; i++) {
            long newValue = fibonacciCalculator(fibonacciNumbers.get(i-2), fibonacciNumbers.get(i-1));

            if(newValue <= maxValue) {
                fibonacciNumbers.add(newValue);

            } else {
                break;
            }

        }

        //tests whether all the values are even and adds them together
        for(int i = 1; i < fibonacciNumbers.size(); i = i+3) {
            long addingValue = fibonacciNumbers.get(i);
            sumValue = sumValue + addingValue;
        }

        System.out.println(sumValue);
    }


    //Does the calculation to find terms for the fibonacci sequence
   public static long fibonacciCalculator(long firstPrecedingValue, long secondPrecedingValue) {
       long finalValue = 0;

       finalValue = firstPrecedingValue + secondPrecedingValue;
        return finalValue;
    }


}
