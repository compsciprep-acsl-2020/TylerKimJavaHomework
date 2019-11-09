import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.List;

public class rotatingArrays {

    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<Integer> inputArray = new ArrayList<>();
        List<Integer> finalArray = new ArrayList<>();

        //Initiation
        System.out.println("Type your first Value: ");
        int firstInput = input.nextInt();

        System.out.println("Type your second value: ");
        int secondInput = input.nextInt();

        System.out.println("Type your third value: ");
        int thirdInput = input.nextInt();

        inputArray.add(firstInput);
        inputArray.add(secondInput);
        inputArray.add(thirdInput);

        //Rotate 1 left
        finalArray.add(secondInput);
        finalArray.add(thirdInput);
        finalArray.add(firstInput);

        //print final values
        System.out.println(inputArray);
        System.out.println(finalArray);
    }
}
