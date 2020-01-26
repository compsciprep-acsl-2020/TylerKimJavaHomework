import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TKim_2_ACSLSamenessFactor_201920 {

    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\danie\\dev\\TylerKimJavaHomework\\Competition\\src\\TKim_2_ACSLSamenessFactor_201920_SampleInputs"));

        while(input.hasNext()) {
            String inputString = input.nextLine();
            String[] tempArr = inputString.split(" ");
            String text1 = tempArr[0];
            String text2 = tempArr[1];
            ArrayList<String> firstText = new ArrayList<>();
            ArrayList<String> secondText = new ArrayList<>();
            firstText = convertStringToArray(text1);
            secondText = convertStringToArray(text2);
            ArrayList<String> finalText = new ArrayList<>();
            int output = 0;

            System.out.println("Initial String: " + firstText + " " + secondText);

            if(firstText.size() > secondText.size()) {

                output = firstTextLarger(firstText, secondText);

            } else {
               output = secondTextLarger(firstText, secondText);
            }

           System.out.println(output);



        }

    }

    public static ArrayList<String> convertStringToArray(String text) {
        ArrayList<String> listOfStrings = new ArrayList<>();

        for(int i = 0; i < text.length(); i++) {
            listOfStrings.add(text.substring(i, i+1));
        }

        return listOfStrings;
    }


    public static ArrayList<String> fillUpRestOfLongerString(ArrayList<String> longerString, ArrayList<String> shorterString) {
       ArrayList<String> stringArray = new ArrayList<>();

        for(int i = shorterString.size(); i < longerString.size(); i++) {
            stringArray.add(longerString.get(i));
        }

        return stringArray;
    }

    public static int firstTextLarger(ArrayList<String> firstText, ArrayList<String> secondString) {

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        while(true) {
            stringBuilder1 = new StringBuilder();
            stringBuilder2 = new StringBuilder();

            boolean readyToMoveOn = true;

            //purge 1
            for(int i = 0; i < secondString.size(); i++) {
                try {
                    if(firstText.get(i).equals(secondString.get(i))) {
                        readyToMoveOn = false;
                    } else {
                        stringBuilder1.append(firstText.get(i));
                        stringBuilder2.append(secondString.get(i));
                    }

                } catch(IndexOutOfBoundsException e) {
                    break;
                }
            }

            for(int i = 0; i < fillUpRestOfLongerString(firstText, secondString).size(); i++) {
                stringBuilder2.append(fillUpRestOfLongerString(firstText,secondString).get(i));
            }

            firstText = convertStringToArray(stringBuilder1.toString());
            secondString = convertStringToArray(stringBuilder2.toString());

            stringBuilder1= new StringBuilder();
            stringBuilder2= new StringBuilder();

            //purge 2
            for(int i = 0; i < secondString.size(); i++) {

                try {
                    if(i < firstText.size()-1 && secondString.get(i).equals(firstText.get(i+1))) {
                        readyToMoveOn = false;
                        stringBuilder1.append(secondString.get(i));
                    } else if(i < secondString.size()-1 && firstText.get(i).equals(secondString.get(i+1))) {
                        readyToMoveOn = false;
                        stringBuilder2.append(secondString.get(i));
                    }
                    else {
                        stringBuilder1.append(secondString.get(i));
                        stringBuilder2.append(firstText.get(i));
                    }

                } catch(IndexOutOfBoundsException e) {
                    break;
                }

            }

            for(int i = 0; i < fillUpRestOfLongerString(firstText, secondString).size(); i++) {
                stringBuilder2.append(fillUpRestOfLongerString(firstText,secondString).get(i));
            }

            firstText = convertStringToArray(stringBuilder1.toString());
            secondString = convertStringToArray(stringBuilder2.toString());

            if(readyToMoveOn) {
                break;
            }

        }
        System.out.println(stringBuilder1.toString() + " " + stringBuilder2.toString());

        int finalValue = ASFCalculations(stringBuilder2.toString(), stringBuilder1.toString());

        return finalValue;
    }

    public static int secondTextLarger(ArrayList<String> firstText, ArrayList<String> secondString) {

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        while(true) {
          stringBuilder1 = new StringBuilder();
          stringBuilder2 = new StringBuilder();

            boolean readyToMoveOn = true;

            //purge 1
            for(int i = 0; i < firstText.size(); i++) {
                try {
                    if(secondString.get(i).equals(firstText.get(i))) {
                        readyToMoveOn = false;
                    } else {
                        stringBuilder1.append(firstText.get(i));
                        stringBuilder2.append(secondString.get(i));
                    }

                } catch(IndexOutOfBoundsException e) {
                    break;
                }
            }

            if(firstText.size() > secondString.size()) {
                stringBuilder1.append(fillRestOfString(secondString.size(), firstText));

            } else if(secondString.size() > firstText.size()) {
                stringBuilder2.append(fillRestOfString(firstText.size(), secondString));
            }


            for(int i = 0; i < fillUpRestOfLongerString(secondString, firstText).size(); i++) {
                stringBuilder2.append(fillUpRestOfLongerString(secondString,firstText).get(i));
            }

            firstText = convertStringToArray(stringBuilder1.toString());
            secondString = convertStringToArray(stringBuilder2.toString());

            stringBuilder1= new StringBuilder();
            stringBuilder2= new StringBuilder();

            //purge 2
            for(int i = 0; i < firstText.size(); i++) {

                try {
                    if(i < secondString.size() - 1 && firstText.get(i).equals(secondString.get(i+1))) {
                        readyToMoveOn = false;
                        stringBuilder1.append(firstText.get(i));
                        stringBuilder1.append(fillRestOfString(i + 1, firstText));
                        stringBuilder2.append(fillRestOfString(i+1, secondString));
                        break;

                    } else if(i < firstText.size() -1 && secondString.get(i).equals(firstText.get(i+1))) {
                        readyToMoveOn = false;
                        stringBuilder2.append(secondString.get(i));
                        stringBuilder1.append(fillRestOfString(i + 1, firstText));
                        stringBuilder2.append(fillRestOfString(i+1, secondString));
                        break;

                    }
                    else {
                        stringBuilder1.append(firstText.get(i));
                        stringBuilder2.append(secondString.get(i));
                    }

                } catch(IndexOutOfBoundsException e) {
                    break;
                }

            }

            if(firstText.size() > secondString.size() && stringBuilder1.length() != firstText.size()) {
                stringBuilder1.append(fillRestOfString(secondString.size(), firstText));

            } else if(secondString.size() > firstText.size() && stringBuilder2.length() != secondString.size()) {
                stringBuilder2.append(fillRestOfString(firstText.size(), secondString));
            }


            for(int i = 0; i < fillUpRestOfLongerString(secondString, firstText).size(); i++) {
                stringBuilder2.append(fillUpRestOfLongerString(secondString,firstText).get(i));
            }

            firstText = convertStringToArray(stringBuilder1.toString());
            secondString = convertStringToArray(stringBuilder2.toString());

            if(readyToMoveOn) {
                break;
            }

        }
        System.out.println(stringBuilder1.toString() + " " + stringBuilder2.toString());

        int finalValue = ASFCalculations(stringBuilder1.toString(), stringBuilder2.toString());

        return finalValue;
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


    public static ArrayList<String> fillRestOfLargerString(ArrayList<String> text, ArrayList<String> shorterText) {
        ArrayList<String> string = new ArrayList<>();

        for(int i = shorterText.size(); i < text.size(); i++) {
            string.add(text.get(i));
        }
        return text;
    }

    public static String fillRestOfString(int i, ArrayList<String> text) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int x = i; x < text.size(); x++) {
            stringBuilder.append(text.get(x));
        }

        return stringBuilder.toString();
    }

}

