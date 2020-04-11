package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeTimeJunior {

    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:\\Users\\tyler\\dev\\TylerKimJavaHomework\\Homework\\src\\Homework\\PrimeTimeJuniorInput"));

      while(input.hasNext()) {
          ArrayList<String> output = new ArrayList<>();
          String inputLine = input.nextLine();

          //compute final
          if(isCircular(inputLine)) {
              output.add("Circular");
          }

          if(isLeft(inputLine)) {
              output.add("Left");
          }

          if(isRight(inputLine)) {
              output.add("Right");
          }

          if(isInterior(inputLine)) {
              output.add("Interior");
          }

          if(output.size() == 0) {
              output.add("NONE");
          }

          System.out.println(output);
      }



    }

    //executing methods
        //circular
    public static boolean isCircular(String input) {
        int tempValue = rotate(input);



        if(isPrime(tempValue)) {
            return true;
        }


        for(int i = 0; i < input.length(); i++) {
            tempValue = rotate(Integer.toString(tempValue));

            if(!isPrime(tempValue)) {
                return false;
            }
        }

        return true;

    }

        //left
    public static boolean isLeft(String input) {
        if(isPrime(leftMost(input))) {
            return true;
        }
        return false;
    }

        //right
    public static boolean isRight(String input) {
        if(isPrime(rightMost(input)))  {
            return true;
        }
        return false;
    }

        //interior
    public static boolean isInterior(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < input.length()-1; i++) {

            for(int j = 0; j < input.length(); j++) {
                if(i != j) {
                    stringBuilder.append(input.substring(j, j+1));
                    if(isPrime(Integer.parseInt(stringBuilder.toString()))) {
                        return true;
                    }
                }
            }

        }

        return false;
    }



    //supplementary methods
        //prime number finder
    public static boolean isPrime(int number) {

        if(number == 1) {
            return false;
        }

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

        //rotate numbers
    public static int rotate(String number) {
        StringBuilder stringBuilder = new StringBuilder();
        String tempValue = number.substring(0, 1);

        for(int i = 1; i < number.length(); i++) {
            stringBuilder.append(number.substring(i, i+1));
        }

        stringBuilder.append(tempValue);
        String finalString = stringBuilder.toString();

        return Integer.parseInt(finalString);

    }

        //left delete
    public static int rightMost(String number) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < number.length()-1; i++) {
            stringBuilder.append(number.substring(i, i+1));
        }

        String numberString = stringBuilder.toString();
        return Integer.parseInt(numberString);
    }

        //right delete
    public static int leftMost(String number) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < number.length(); i++) {
            stringBuilder.append(number.substring(i, i+1));
        }

        String numberString = stringBuilder.toString();
        return Integer.parseInt(numberString);
    }

}
