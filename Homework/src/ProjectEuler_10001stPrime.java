import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProjectEuler_10001stPrime {
    //Main method
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<Long> primeNumbers = new ArrayList<Long>();

        //Initiation
        System.out.println("Enter your max value: ");
        long maxValue = input.nextLong();

        //List all the prime numbers
        for(long i = 1; primeNumbers.size() <= (maxValue - 1); i = i + 2) {

            long outputValue = primeNumberTester(i);

            if(outputValue != 0) {
                primeNumbers.add(i);
            }
        }

        System.out.println("Here are all the Prime Numbers:  ");
        System.out.println(primeNumbers);

        System.out.println("Here is the largest prime number: ");
        System.out.println(primeNumbers.get((primeNumbers.size()-1)));
    }

    //test if the value is a prime number
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
