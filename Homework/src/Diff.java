import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Diff {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<String> commonString = new ArrayList<>();

        //Initiation
        System.out.println("ACSL Intermediate Division Diff Program");
        System.out.println("Enter Input: ");
        System.out.println("ex. abcddef vdfaddwf");
        String firstString = input.nextLine();

        String[] parts = firstString.split(" ", 2);
        String firstInput = parts[0];
        String secondInput = parts[1];

        //Compare Strings
        commonString = findCommonString(firstInput, secondInput);

        System.out.println(commonString);
    }

    //find the common string
    public static ArrayList<String> findCommonString(String firstString, String secondString) {
        ArrayList<String> commonString = new ArrayList<>();

        for(int i = 0; i < firstString.length(); i++) {
            String testingString = firstString.substring(i, i+1);

            for(int x = 0; x < secondString.length(); x++) {
                if(testingString.equals(secondString.substring(x, x+1))) {
                    commonString.add(testingString);
                    break;
                }
            }
        }

        return commonString;
    }
}
