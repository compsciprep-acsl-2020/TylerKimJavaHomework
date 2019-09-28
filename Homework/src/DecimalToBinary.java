import java.util.Scanner;

public class DecimalToBinary {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input
        int decimalNumber = input.nextInt();
        System.out.println(decimalNumber);

        int seventhPower = 0;
        int sixthPower = 0;
        int fifthPower = 0;
        int fourthPower = 0;
        int thirdPower = 0;
        int secondPower = 0;
        int firstPower = 0;
        int zeroPower = 0;

        while(true) {
            int finalDecimalNumber = 0;
            finalDecimalNumber = decimalNumber;

            int value = finalDecimalNumber;

            if(value >= 128) {
                seventhPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 128);

            } else if(value <= 64 && value >= 32) {
                sixthPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 64);

            } else if(value <= 32 && value >= 16) {
                fifthPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 32);

            } else if(value <= 16 && value >= 8) {
                fourthPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 16);

            } else if(value <= 8 && value >= 4) {
                thirdPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 8);

            } else if(value <= 4 && value >= 2) {
                secondPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 4);

            } else if(value <= 2 && value >= 1) {
                firstPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 2);

            } else {
                zeroPower = 1;
                finalDecimalNumber = (finalDecimalNumber - 1);
            }

            if(decimalNumber == 0) {
                System.out.println(seventhPower);
                System.out.println(sixthPower);
                System.out.println(fifthPower);
                System.out.println(fourthPower);
                System.out.println(thirdPower);
                System.out.println(secondPower);
                System.out.println(firstPower);
                System.out.println(zeroPower);
                break;
            }


        }
    }
}
