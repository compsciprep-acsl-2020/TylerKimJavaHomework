package w3resourceHomework;

public class Question58 {

    public static void main(String args[]) {

        String input = "string";
        System.out.println("the given strings is: " + input);
        System.out.println("the string containing ng at last: ");
        boolean value = false;

        if(input.substring(input.length()-2, input.length()).equals("ng")) {
            value = true;
        }

        System.out.print(value);

    }

}
