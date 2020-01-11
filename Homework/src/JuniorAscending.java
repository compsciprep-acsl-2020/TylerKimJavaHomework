import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class JuniorAscending {
    public static void main(String args[]) {
        //Declaration
        Scanner input = new Scanner(System.in);
        List<String> finalValues = new ArrayList<>();
        int addingValue = 1;

        //Initiation
        System.out.println("Enter Input: ");
        System.out.println("e.g. 314159265");
        String inputString = input.next();

        //Add first Value
        finalValues.add(inputString.charAt(0) + "");

        //Add subsequent values
        for(int i = 1; i < inputString.length(); i = i+addingValue) {

            try
            {
                if(Integer.parseInt(inputString.substring(i, i+addingValue)) > Integer.parseInt(finalValues.get(finalValues.size()-1))) {
                    finalValues.add(inputString.substring(i, i+addingValue));


                } else {
                    addingValue++;
                    finalValues.add(inputString.substring(i, i+addingValue));
                }

            } catch(StringIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println(finalValues);
    }
}
