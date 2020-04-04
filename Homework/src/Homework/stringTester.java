package Homework;

public class stringTester {

    public static void main(String args[]) {
        String s = "Barbara";
        int x = 0;

        for(int i = 0; i < s.length()-3; i++) {
            if (s.substring(i, i+3).equals("Bar") || s.substring(i, i+3).equals("bar")) {
                 x++;
            }
        }

        System.out.println(x);

    }
}
