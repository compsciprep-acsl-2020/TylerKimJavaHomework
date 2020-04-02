package w3resourceHomework;

public class Question48 {

    public static void main(String args[]) {
        String input = "abrambabasc";

        System.out.println(filterAC(filterB(input)));

    }

    //filter b
    public static String filterB(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            if(input.substring(i, i+1).equals("b")) {
                continue;
            } else {
                stringBuilder.append(input.substring(i, i+1));
            }
        }
    return stringBuilder.toString();

    }



    //filter ac
    public static String filterAC(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < input.length(); i+=2) {
            if(input.substring(i, i+2).equals("ac")) {
                continue;
            } else {
                stringBuilder.append(input.substring(i, i+2));
            }
        }
        return stringBuilder.toString();

    }
}
