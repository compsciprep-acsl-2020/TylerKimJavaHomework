package w3resourceHomework;

import java.util.ArrayList;

public class Question42 {

    public static void main(String args[]) {
        ArrayList<String> given = new ArrayList<>();

        given.add("rabbit");
        given.add("bribe");
        given.add("dog");

        String givenWord = "bib";

        System.out.println(purgeRepeats(wordToArray(given, givenWord)));
    }

    //comparison
    public static ArrayList<String> wordToArray(ArrayList<String> arrayList, String givenWord) {
        ArrayList<String> output = new ArrayList<>();
        char[] charSequence = givenWord.toCharArray();
        int counter = 0;

        for(int i = 0; i < arrayList.size(); i++) {

            for(int j = 0; j < arrayList.get(i).length(); j++) {

                for(int k = 0; k < charSequence.length; k++) {
                    if(arrayList.get(i).charAt(k)==(charSequence[k])) {
                        if(counter >=3) {
                            output.add(arrayList.get(i));
                        }
                        counter++;
                    }
                }

            }

        }

        return output;

    }

    //take out repeats
    public static ArrayList<String> purgeRepeats(ArrayList<String> arrayList) {
        ArrayList<String> output = new ArrayList<>();

        output.add(arrayList.get(0));

        for(int i = 0; i < arrayList.size(); i++) {
            if(!output.get(output.size()-1).equals(arrayList.get(i))) {
                output.add(arrayList.get(i));
            }
        }

        return output;
    }
}
