package w3resourceHomework;


import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Question32 {

    public static void main(String args[]) {
        String input = "thequickbrownfoxxofnworbquickthe";
        int divider = input.length()/2;
        char[] charArr = input.toCharArray();
        char midPoint1 = charArr[divider];
        ArrayList<ArrayList<Character>> finalArrayList = new ArrayList<>();

        finalArrayList = findPalindrome(arrayToMidPoint(charArr, divider), inverseAtMidPoint(charArr, divider), divider);

        System.out.println(combineAllParts(finalArrayList.get(0), finalArrayList.get(1), midPoint1));



    }

    //find backend
    public static char[] inverseAtMidPoint(char[] charArr, int divider) {
        //start at end and come to middle
        char[] tempArr = new char[divider];
        int counter = 0;

        for(int i = charArr.length-1; i > divider; i--) {

            tempArr[counter] = charArr[i];
            counter++;

        }

        return tempArr;
    }


    //find front end
    public static char[] arrayToMidPoint(char[] charArr, int divider) {
        char[] tempArr = new char[divider];

        for(int i = 0; i < divider-1; i++) {

            tempArr[i] = charArr[i];

        }

        return tempArr;
    }

    //comparison
    public static ArrayList<ArrayList<Character>> findPalindrome(char[] front, char[] back, int divider) {
        ArrayList<Character> outputFront = new ArrayList<>();
        ArrayList<Character> outputBack = new ArrayList<>();
        ArrayList<ArrayList<Character>> output = new ArrayList<>();

        //compare and add
        for(int i = 0; i < divider; i++) {
            if(front[i] == back[i]) {
                outputFront.add(front[i]);
                outputBack.add(back[i]);
            } else {
                outputFront.add(' ');
                outputBack.add(' ');
            }
        }

        purgeExtraSpace(outputFront);
        purgeExtraSpace(outputBack);

        outputFront.remove(outputFront.size()-1);
        outputBack.remove(outputBack.size()-1);

        output.add(outputFront);
        output.add(outputBack);

        return output;
    }

    //purge extra space
    public static ArrayList<Character> purgeExtraSpace(ArrayList<Character> arrayList) {
        int x = 0;

        for(int i = arrayList.size()-2; i > 0; i --) {
            if (arrayList.get(i).equals(' ')) {
                x = i;
                break;
            }
        }

        for(int i = 0; i <= x; i++) {
            arrayList.remove(0);
        }

        return arrayList;
    }

    //Combine them all
    public static String combineAllParts(ArrayList<Character> front, ArrayList<Character> back, char middleTerm) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> inverseOfBack = new ArrayList<>();

        for(int i = back.size()-1; i >= 0; i--) {
            inverseOfBack.add(back.get(i));
        }

        for(int i = 0; i < front.size(); i++) {
            stringBuilder.append(front.get(i));
        }

        stringBuilder.append(middleTerm);
        stringBuilder.append(middleTerm);

        for(int i = 0; i < back.size(); i++) {
            stringBuilder.append(inverseOfBack.get(i));
        }

        String output = stringBuilder.toString();
        return output;
    }
}
