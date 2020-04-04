package Homework;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Enclosure {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int operatorID;
        String missingOperator;
        List<Integer> finalValues = new ArrayList<>();
        List<Integer> indexValuesOfOperators = new ArrayList<>();

        //Initiation
        System.out.println("Type in your input: ");
        String expression = input.next();

        System.out.println(indexValuesOfOperators);
        //test if the missing value is a square bracket or parenthesis
        //0 = open square   1 = open parenthesis   2 = closed parenthesis   3 = closed square
        if(operatorCounter(expression, "(") != 1) {

             operatorID = 1;

        } else if(operatorCounter(expression, "[") != 1) {

            operatorID = 0;

        } else if(operatorCounter(expression, "]") != 1) {

             operatorID = 3;

        } else {

             operatorID = 2;
        }

        switch(operatorID) {
            case 0:
                System.out.println("[");
                missingOperator = "[";
                for(int i = 0; i < expression.indexOf("]"); i++) {
                    if(expression.substring(i, i+1).equals("+") || expression.substring(i, i+1).equals("-") || expression.substring(i, i+1).equals("*") || expression.substring(i, i+1).equals("/")) {
                        indexValuesOfOperators.add(i);
                    }
                }

                System.out.println(indexValuesOfOperators);
                break;

            case 1:
                System.out.println("(");
                missingOperator = "(";

                for(int i = 0; i < expression.indexOf(")"); i++) {
                    if(expression.substring(i, i+1).equals("+") || expression.substring(i, i+1).equals("-") || expression.substring(i, i+1).equals("*") || expression.substring(i, i+1).equals("/")) {
                        indexValuesOfOperators.add(i);
                    }
                }

                System.out.println(indexValuesOfOperators);
                break;

            case 2:
                System.out.println(")");
                missingOperator = ")";


                indexValuesOfOperators.add(expression.indexOf("]")+1);
                for(int y = expression.indexOf("(") + 3; y < expression.indexOf("]"); y++) {
                    if(expression.substring(y, y+1).equals("+") || expression.substring(y, y+1).equals("-") || expression.substring(y, y+1).equals("*") || expression.substring(y, y+1).equals("/")) {
                        if(expression.substring(expression.indexOf("("), y).contains("+") || expression.substring(expression.indexOf("("), y).contains("-") || expression.substring(expression.indexOf("("), y).contains("*") || expression.substring(expression.indexOf("("), y).contains("/")) {
                            indexValuesOfOperators.add(y+1);
                        }

                    }
                }

                System.out.println(indexValuesOfOperators);


                break;

            case 3:
                System.out.println("]");
                missingOperator = "]";

                //firsthalf
                indexValuesOfOperators.add(expression.length()+1);
                for(int i = expression.indexOf("["); i < expression.indexOf("("); i++) {
                    if(expression.substring(i, i+1).equals("+") || expression.substring(i, i+1).equals("-") || expression.substring(i, i+1).equals("*") || expression.substring(i, i+1).equals("/")) {
                        if(expression.substring(expression.indexOf("("), i).contains("+") || expression.substring(expression.indexOf("("), i).contains("-") || expression.substring(expression.indexOf("("), i).contains("*") || expression.substring(expression.indexOf("("), i).contains("/")) {
                            indexValuesOfOperators.add(i);
                        }

                    }
                }

                //second half
                for(int y = expression.length()-1; y > expression.indexOf(")"); y--) {
                    if(expression.substring(y, y+1).equals("+") || expression.substring(y, y+1).equals("-") || expression.substring(y, y+1).equals("*") || expression.substring(y, y+1).equals("/")) {
                        if(expression.substring(expression.indexOf("("), y).contains("+") || expression.substring(expression.indexOf("("), y).contains("-") || expression.substring(expression.indexOf("("), y).contains("*") || expression.substring(expression.indexOf("("), y).contains("/")) {
                            indexValuesOfOperators.add(y+1);
                        }
                    }
                }

                System.out.println(indexValuesOfOperators);
                break;
        }
    }

    //find which operator is missing
    public static int operatorCounter(String text, String operator) {

        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            if(text.substring(i, i+1).equals(operator)) {
                count++;
                return count;
            }
        }

        return 0;
    }

}
