package w3resourceHomework;

import java.util.ArrayList;

public class Question46 {

    public static void main(String args[]) {
        String input = "This is a test string";
        String[] strArr = input.split(" ");
        String[] outputArr = new String[strArr.length];
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            outputArr[i] = reverseString(strArr[i]);
        }

        for(int i = 0; i < outputArr.length; i++) {
            output.add(outputArr[i]);
        }

        System.out.println(output);

    }

    public static String reverseString(String input) {
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> backward = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            temp.add(input.substring(i, i+1));
        }

        for(int i = temp.size()-1; i >= 0; i--) {
            backward.add(temp.get(i));
        }

        for(int i = 0; i < backward.size(); i++) {
            stringBuilder.append(backward.get(i));
        }

        return stringBuilder.toString();

    }

}
