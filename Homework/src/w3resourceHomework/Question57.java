package w3resourceHomework;

public class Question57 {

    public static void main(String args[]) {

        String input = "string";

        System.out.println("The given strings is: " + input);
        System.out.println("The string after swap last two characters are: " + switchLastTwoCharacters(input));


    }

    public static String switchLastTwoCharacters(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < input.length() - 2; i++) {
            stringBuilder.append(input.substring(i, i+1));
        }

        stringBuilder.append(input.substring(input.length()-1, input.length()));
        stringBuilder.append(input.substring(input.length()-2, input.length()-1));
    return stringBuilder.toString();
    }



}
