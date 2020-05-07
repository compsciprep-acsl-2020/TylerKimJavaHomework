package Homework;

public class PickANumber {

    public static void main(String args[]) {

        String test = "250, 3, D, H, A";
        String[] arr = test.split(", ");
        int length = Integer.toBinaryString(Integer.parseInt(arr[0])).length();

        System.out.println(findNumber(test, length));
        System.out.println(findLength(arr));

    }

    //test = columns
    public static int findNumber(String test, int length) {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz".toUpperCase();   //
        String[] alphabet = alphabetString.split("");
        String isInColumn = "";

        for(int i = 0; i < length; i++) {
            if(test.contains(alphabet[i])) {

                isInColumn = "1" + isInColumn;

            } else {

                isInColumn = "0" + isInColumn;

            }

        }

        return Integer.parseInt(isInColumn,2);
    }

    //finding length
    public static int findLength(String[] test) {
        String columnName = test[2];
        int count = 0;
        String alphabetString = "abcdefghijklmnopqrstuvwxyz".toUpperCase();   //
        String[] alphabet = alphabetString.split("");
        int indexOfValue = alphabetString.indexOf(columnName);

        for(int i = 1; i <= Integer.parseInt(test[0]); i++) {
            String binary = Integer.toBinaryString(i);
            String reverseString = reverseString(binary);

            if(reverseString.length() >= (indexOfValue + 1)) {

                if(reverseString.charAt(indexOfValue) == '1' ) {
                    count++;
                }
            }
        }

        return count;

    }

    //reverse method
    public static String reverseString(String value) {
        StringBuilder stringBuilder = new StringBuilder(value);

        return stringBuilder.reverse().toString();
    }
}
