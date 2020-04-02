package w3resourceHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class Question40 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();

        System.out.println("Give String: ");
        String input = scan.next();

        System.out.println("Given Parts: ");
        int parts = scan.nextInt();

        //test
        if(testIfPartsIsDivisible(input, parts)) {
            System.out.println("Continue...");
            result = divideStringEqually(input, parts);
        } else {
            System.out.println("Stop");
            System.exit(0);
        }

        //result of comparison
        System.out.println(result);

    }

    //testing method
    public static boolean testIfPartsIsDivisible(String input, int parts) {
        if((input.length() % parts) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //divide the string
    public static ArrayList<String> divideStringEqually(String input, int parts) {
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < input.length(); i+=parts) {
            output.add(input.substring(i, i + 5));
        }

        return output;
    }

}
