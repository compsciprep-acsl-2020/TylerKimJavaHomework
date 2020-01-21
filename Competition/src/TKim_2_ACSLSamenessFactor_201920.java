import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class TKim_2_ACSLSamenessFactor_201920 {

    public static void main(String args[]) throws FileNotFoundException {
        //Initialization
        Scanner input = new Scanner(new File("C:\\Users\\tyler\\dev\\TylerKimJavaHomework\\Competition\\src\\TKim_2_ACSLSamenessFactor_201920_SampleInputs"));

        while (input.hasNext()) {
            //Parse input and convert to two arraylists
            List<String> texts = new ArrayList<>();
            List<String> text1 = new ArrayList<>();
            List<String> text2 = new ArrayList<>();
            String inputString = input.nextLine();
            String[] tempArray = inputString.split(" ");
            String firstText = tempArray[0];
            String secondText = tempArray[1];
            List<String> largerArrayList = new ArrayList<>();
            List<String> shorterArrayList = new ArrayList<>();
            String longerText;
            String shorterText;


            String modifiedString1;
            String modifieydString2;

            while (true) {
                boolean readyToMoveOn = true;
                StringBuilder stringbuilder1 = new StringBuilder();
                StringBuilder stringbuilder2 = new StringBuilder();


                if (firstText.length() >= secondText.length()) {
                    longerText = firstText;
                    shorterText = secondText;
                } else {
                    longerText = secondText;
                    shorterText = firstText;
                }

                //find sameness factor
                for (int i = 0; i < shorterText.length(); i++) {

                    if ( firstText.substring(i, i + 1).equals(secondText.substring(i, i + 1))) {
                        readyToMoveOn = false;
                        continue;


                    } else if(i + 1 < secondText.length() && firstText.substring(i, i + 1).equals(secondText.substring(i + 1, i + 2)) && i + 1 < firstText.length() && secondText.substring(i, i + 1).equals(firstText.substring(i + 1, i + 2)))  {

                        continue;
                    }
                    else if (i + 1 < secondText.length() && firstText.substring(i, i + 1).equals(secondText.substring(i + 1, i + 2))){
                        stringbuilder1.append(firstText.substring(i, i + 1));
                        readyToMoveOn = false;
                        continue;

                    } else if (i + 1 < firstText.length() && secondText.substring(i, i + 1).equals(firstText.substring(i + 1, i + 2))) {
                        stringbuilder2.append(secondText.substring(i, i + 1));
                        readyToMoveOn = false;

                        continue;
                    } else {
                        stringbuilder1.append(firstText.substring(i, i + 1));
                        stringbuilder2.append(secondText.substring(i, i + 1));
                    }

                }

                for (int x = shorterText.length(); x < longerText.length(); x++) {
                    if(x + 1 < secondText.length()) {
                        stringbuilder2.append(secondText.substring(x, x + 1));

                    }
                }



                if (readyToMoveOn == true) {
                    break;
                }

                firstText = stringbuilder1.toString();
                secondText = stringbuilder2.toString();

            }

            if (firstText.length() >= secondText.length()) {
                longerText = firstText;
                shorterText = secondText;
            } else {
                longerText = secondText;
                shorterText = firstText;
            }

            int finalValue = ASFCalculations(firstText, secondText);
            System.out.println(finalValue);


        }
    }

    public static int ASFCalculations(String firstText, String secondText) {
        int finalValue = 0;
        int counter = 0;
        List<Character> charArray1 = new ArrayList<>();
        List<Character> charArray2 = new ArrayList<>();
        String longerText;
        String shorterText;

        if(firstText.length() >= secondText.length()) {
            longerText = firstText;
            shorterText = secondText;

        } else {

            longerText = secondText;
            shorterText = firstText;

        }

       for(int i = 0; i < firstText.length(); i++){
           charArray1.add(firstText.charAt(i));
       }
       for(int x = 0; x < secondText.length(); x++) {
           charArray2.add(secondText.charAt(x));
       }

       for(int t = 0; t < shorterText.length(); t++) {
           finalValue = finalValue + (((int) charArray1.get(t) - 64) - ((int) charArray2.get(t)-64));
       }

       for(int y = shorterText.length(); y < longerText.length(); y++) {
           counter++;
       }

       finalValue = finalValue + counter;

        return finalValue;





    }



}

