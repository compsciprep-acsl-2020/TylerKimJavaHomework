package w3resourceHomework;

import java.util.ArrayList;

public class Question45 {

    public static void main(String args[]) {

        String input = "Reverse words in a given string";
        String[] stringArr = input.split(" ");

        System.out.println(changeFirstWordToBeLast(stringArr));
    }

    public static ArrayList<String> changeFirstWordToBeLast(String[] stringArr) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        for(int i = 1; i < stringArr.length; i++) {
             stringArrayList.add(stringArr[i]);
        }

        stringArrayList.add(stringArr[0]);

        return stringArrayList;
    }
}
