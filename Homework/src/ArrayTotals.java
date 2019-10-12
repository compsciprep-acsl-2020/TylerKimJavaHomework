import java.util.Random;

public class ArrayTotals {

    public static void main(String args[]) {
        //Set Declaration
        int randomNumbers[] = new int[100];
        int oddCount = 0;
        int evenCount = 0;
        Random randomizer = new Random();

        //Make list of all the random numbers
        for(int i = 0; i < 100; i++) {
            randomNumbers[i] = randomizer.nextInt(1000);
        }

        int evens[] = evenNumberTest(randomNumbers);
        int odds[] = oddNumberTest(randomNumbers);


        System.out.println("Even Numbers: ");
        for(int i = 0; i < (evens.length ); i++) {

            if(evens[i] != 0) {
                evenCount++;
                System.out.println(evens[i]);
            }

        }
        System.out.println(" ");

        System.out.println("Odd Numbers: ");
        for (int i = 0; i < (odds.length ); i++) {
            if(odds[i] != 0) {
                oddCount++;
                System.out.println(odds[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Size of Arrays: ");
        System.out.println("Odd Number: " + oddCount);
        System.out.println("Even Number: " + evenCount);

    }


    //Test if the number is even
    public static int[] evenNumberTest(int[] hypothesis) {
        int evenNumbers[] = new int[100];

        for(int i = 0; i < 100; i++) {
            if(hypothesis[i] % 2 == 0 && hypothesis[i] != 0) {
                evenNumbers[i] = hypothesis[i];
            } else {

            }
        }
        return evenNumbers;
    }

    //Test if the number is odd
    public static int[] oddNumberTest(int[] hypothesis) {
        int oddNumbers[] = new int[100];

        for(int i = 0; i <= 99; i++){
            if(hypothesis[i] % 2 != 0 && hypothesis[i] != 0){
                oddNumbers[i] = hypothesis[i];
            }
        }

        return oddNumbers;
    }

}
