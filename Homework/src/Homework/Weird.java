package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Weird {

    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:\\Users\\tyler\\dev\\TylerKimJavaHomework\\Homework\\src\\Homework\\WeirdTextInput"));

            while(input.hasNext()) {
                String[] inputValues = input.nextLine().split(", ");
                int definition = Integer.parseInt(inputValues[0]);
                int parameterNumber = Integer.parseInt(inputValues[1]);



                switch(definition) {
                    case 1:
                        System.out.println(def1(parameterNumber));
                        break;

                    case 2:
                        System.out.println(def2(parameterNumber)[1] + ", " + def2(parameterNumber)[0]);
                        break;

                    case 3:
                       System.out.println(def3(parameterNumber)[0] + ", " + def3(parameterNumber)[1]);
                       break;

                    case 4:
                        System.out.println(def4(parameterNumber));
                        break;

                    case 5:
                        System.out.println(def5(parameterNumber));
                        break;

                    case 6:
                        System.out.println(def6(parameterNumber));
                        break;

                    case 7:
                        System.out.println(def7(parameterNumber));
                        break;

                    case 8:
                        System.out.println(def8(parameterNumber));
                        break;

                }
            }


    }


    //executors
        //first definition
    public static int def1(int parameterNumber) {
        int result = 0;

        for(int i = parameterNumber - 1; i > 0; i--) {
            if(isPrimeNumber(i)) {
                result = i;
                break;
            }
        }

        return result;
    }

        //second definition
    public static int[] def2(int parameterNumber) {
        int[] resultArr = new int[2];
        for(int i = parameterNumber - 1; i > 0; i--) {
            if(isTwinPrime(i)) {
                resultArr[0] = i;
                resultArr[1] = i - 2;
                break;
            }
        }

        return resultArr;
    }

        //third definition
    public static int[] def3(int parameterNumber) {
        int[] result = new int[2];

        outerloop:
        for(int i = parameterNumber - 1; i > 0; i--) {

            for(int j = parameterNumber - 1; j > 0; j--) {
                if(isAmicableNumbers(i, j) && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break outerloop;
                }
            }
        }

        return result;
    }

        //fourth definition
    public static int def4(int parameterNumber) {
        int result = 0;

        for(int i = parameterNumber - 1; i > 0; i--) {
            if(isPerfectNumber(i)) {
                result = i;
                break;
            }
        }

       return result;
    }

        //fifth definition
        public static int def5(int parameterNumber) {
        int result = 0;

            for(int i = parameterNumber - 1; i > 0; i--) {
                if(isSemiPerfectNumber(i)) {
                    result = i;
                    break;
                }
            }

            return result;
        }

        //sixth definition
        public static int def6(int parameterNumber) {
        int result = 0;

            for(int i = parameterNumber - 1; i > 0; i--) {
                if(isAbundantNumber(i)) {
                    result = i;
                    break;
                }
            }

           return result;

        }

        //seventh definition
        public static int def7(int parameterNumber) {
        int result = 0;

            for(int i = parameterNumber - 1; i > 0; i--) {
                if(isDeficientNumber(i)) {
                    result = i;
                    break;
                }
            }

          return result;

        }

        //eight definition
        public static int def8(int parameterNumber) {
            int result = 0;

            for(int i = parameterNumber - 1; i > 0; i--) {
                if(isWeirdNumber(i)) {
                    result = i;
                    break;
                }
            }

            return result;
        }

    //definition methods
        //Prime number
    public static boolean isPrimeNumber(int x) {
        for(int i = 2; i < x; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

        //Twin Primes
    public static boolean isTwinPrime(int x) {
        int y = x - 2;

        if(isPrimeNumber(x) && isPrimeNumber(y)) {
            return true;
        }

        return false;
    }

        //Amicable numbers
    public static boolean isAmicableNumbers(int x, int y) {
        ArrayList<Integer> xDivisors = findDivisors(x);
        ArrayList<Integer> yDivisors = findDivisors(y);

        int xSumOfDivisors = 0;
        int ySumOfDivisors = 0;

        xDivisors.remove(xDivisors.size()-1);
        yDivisors.remove(yDivisors.size()-1);

        //find sum of divisors
        for(int i = 0; i < xDivisors.size(); i++) {
            xSumOfDivisors += xDivisors.get(i);
        }

        for(int i = 0; i < yDivisors.size(); i++) {
            ySumOfDivisors += yDivisors.get(i);
        }

        if(xSumOfDivisors == y && ySumOfDivisors == x) {
            return true;
        }

        return false;
    }

        //Perfect numbers
    public static boolean isPerfectNumber(int x) {
        ArrayList<Integer> xDivisors = findDivisors(x);

        int sum = 0;

        for(int i = 0; i < xDivisors.size()-1; i++) {
            sum+= xDivisors.get(i);
        }

        if(sum == x) {
            return true;
        }
        return false;
    }

        //Semi-perfect number
    public static boolean isSemiPerfectNumber(int x) {
        ArrayList<Integer> xDivisors = findDivisors(x);
        xDivisors.remove(xDivisors.size()-1);

        int sum = xDivisors.get(xDivisors.size()-1);

        //test if it is a deficient number
        if(isDeficientNumber(x)) {
            return false;
        }


        //test if is a perfect number
        if(isPerfectNumber(x)) {
            return true;
        }

        for(int i = xDivisors.size()-2; i >= 0; i--) {
          if(sum + xDivisors.get(i) > x) {

          } else if(sum + xDivisors.get(i) < x) {
              sum+= xDivisors.get(i);
          } else {
              return true;
          }
        }

        return false;
    }

        //Abundant number
    public static boolean isAbundantNumber(int x) {
        ArrayList<Integer> xDivisor = findDivisors(x);

        int sum = 0;

        for(int i = 0; i < xDivisor.size() - 1; i++) {
            sum+= xDivisor.get(i);
        }

        if(sum > x) {
            return true;
        }
        return false;

    }

        //Deficient number
    public static boolean isDeficientNumber(int x) {
        ArrayList<Integer> xDivisor = findDivisors(x);

        int sum = 0;

        for(int i = 0; i < xDivisor.size() - 1; i++) {
            sum+= xDivisor.get(i);
        }

        if(sum < x) {
            return true;
        }

        return false;
    }

        //Weird number
    public static boolean isWeirdNumber(int x) {
        if(isAbundantNumber(x) && !isSemiPerfectNumber(x)) {
            return true;
        }
        return false;
    }

    //Supplementary Methods
        //Divisors
    public static ArrayList<Integer> findDivisors(int x) {
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 1; i <= x; i++) {
            if(x % i == 0) {
                output.add(i);
            }
        }

        return output;
    }
}
