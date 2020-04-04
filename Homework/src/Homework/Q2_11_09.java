package Homework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2_11_09 {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<String> inputValue = new ArrayList<>();
        boolean areThere3Threes = false;
        int threeCounter = 0;

        //Initiation
        System.out.println("Type your values seperated by spaces: ");
        System.out.println("e.g 1 2 3 4 5");
        String inputString = input.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString, " ");

        //Find the input values into an array
        while(stringTokenizer.hasMoreTokens()) {
            inputValue.add(stringTokenizer.nextToken());
        }


        //test if there are three 3's
        for(int i = 0; i < inputValue.size(); i++) {

            if(inputValue.get(i).equals("3")) {
                threeCounter++;
                i++;
            }
        }

        //result
        if(threeCounter == 3) {
            areThere3Threes = true;
        } else {
            areThere3Threes = false;
        }

        if(areThere3Threes) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
