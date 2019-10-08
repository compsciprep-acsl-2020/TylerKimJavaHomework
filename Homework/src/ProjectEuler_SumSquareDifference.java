import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProjectEuler_SumSquareDifference {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        int sumSquared = 0;
        int sumOfSquared = 0;
        int sum = 0;
        int discrepancy = 0;

        //Initiation
        System.out.println("Type your max value: ");
        int maxValue = input.nextInt();

        //find sum of the numbers and square the values
        for(int i = 1; i < (maxValue + 1); i++) {

            sum = sum + i;
        }
       sumSquared = SquaringAlgorithm(sum);
        System.out.println("The Sum squared: " + sumSquared);

        //square each value and find the sum
        for(int i = 1; i < (maxValue + 1); i++) {
            sumOfSquared = SquaringAlgorithm(i) + sumOfSquared;
        }

        System.out.println("The sum of the Squared Values: " + sumOfSquared);

        //Find the difference
        discrepancy = sumSquared - sumOfSquared;
        System.out.println("The discrepancy is: " + discrepancy);
    }

    public static int SquaringAlgorithm(int input) {
        int finalOutput = input * input;
        return finalOutput;
    }


}
