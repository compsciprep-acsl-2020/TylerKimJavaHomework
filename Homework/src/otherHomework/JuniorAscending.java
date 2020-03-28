package otherHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class JuniorAscending {
    public static void main(String args[]) throws FileNotFoundException {
        //Declaration
        Scanner input = new Scanner(new File("/Users/elitetazering935/dev/TylerKimJavaHomework/Homework/src/ascendingInput"));
        while(input.hasNext()) {
            List<String> finalValues = new ArrayList<>();
            int addingValue = 1;

            String inputString = input.nextLine();

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

}
