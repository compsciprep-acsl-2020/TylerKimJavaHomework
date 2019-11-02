import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ChangeMode {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Initiation
        System.out.println("Choose the Input Mode BINARY, OCTAL, COMMAND:  ");
        String choice = input.next();

        //Various Input Types
        switch (choice) {
            case "BINARY":
                processBinary();

                break;
            case "OCTAL":
                processOctal();

                break;
            case "COMMAND":
                processCommand();

                break;
            default:
                System.out.println("Unable to Read Input, Please Try Again");
                break;

        }
    }

    //Binary Input
    public static void processBinary() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> finalOctalValue = new ArrayList<>();
        ArrayList<String> binaryFromOctal = new ArrayList<>();
        ArrayList<String> finalCommandValue = new ArrayList<>();


        //Initiation
        System.out.println("Type your binary input using a comma");
        System.out.print("ex. 100,001,101");
        String binaryInput = input.next();

        //process the binary
        StringTokenizer stringTokenizer = new StringTokenizer(binaryInput, ",");

        //Change into Octal
        while(stringTokenizer.hasMoreTokens()) {
            int octalValue = binaryToOctal(stringTokenizer.nextToken());
            finalOctalValue.add(octalValue);
        }

        for(int i : finalOctalValue) {
            binaryFromOctal.add(octalToBinary(i));
        }

        //Change into Command
        for(String binaryUnit : binaryFromOctal) {
            finalCommandValue.add(binaryToCommand(binaryUnit));
        }



        System.out.println(binaryFromOctal);
        System.out.println(" ");
        System.out.println("Octal Value: ");
        System.out.print(finalOctalValue);

        System.out.println(" ");
        System.out.println("Command Form: ");
        System.out.println(finalCommandValue);
    }

    public static void processOctal() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> finalBinary = new ArrayList<>();
        ArrayList<String> finalCommandValue = new ArrayList<>();

        //Initiation
        System.out.println("Type your Octal Value:  ");
        System.out.println("7,5,3");
        String inputOctalValue = input.next();

        //process to binary
        StringTokenizer stringTokenizer = new StringTokenizer(inputOctalValue, ",");

        //Change into Octal
        while(stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            int octalValue = Integer.parseInt(token);
            finalBinary.add(octalToBinary(octalValue));
        }

        for(String binaryUnit : finalBinary) {
            finalCommandValue.add(binaryToCommand(binaryUnit));
        }

        System.out.println(" ");
        System.out.println("Binary Form: ");
        System.out.println(finalBinary);

        System.out.println(" ");
        System.out.println("Command Form: ");
        System.out.println(finalCommandValue);
    }

    public static void processCommand() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> finalBinary = new ArrayList<>();
        ArrayList<Integer> finalOctal = new ArrayList<>();

        //Initiation
        System.out.println("Type your Command Value: ");
        System.out.println("ex. r-w,rwx,-r-");
        String inputCommand = input.next();

        //Setup the String
        StringTokenizer stringTokenizer = new StringTokenizer(inputCommand, ",");

        while(stringTokenizer.hasMoreTokens()) {
            finalBinary.add(commandToBinary(stringTokenizer.nextToken()));
        }

        for(String commandUnit : finalBinary) {
            finalOctal.add(binaryToOctal(commandUnit));
        }
        System.out.println(" ");
        System.out.println("Binary Value: ");
        System.out.println(finalBinary);

        System.out.println(" ");
        System.out.println("Octal Value: ");
        System.out.println(finalOctal);


    }

    public static int binaryToOctal(String binaryUnit) {
        //assuming binaryUnit looks like 100
        int binaryValue = Integer.parseInt(binaryUnit);
        int finalValue = 0;


        while (binaryValue > 0) {
            //if the binary number is greater than 100, than there is a 1 in the 2nd index
            if (binaryValue >= 100) {
                finalValue = finalValue + 4;
                binaryValue = binaryValue - 100;

                //if the code hits here, then there is a 1 in the 1st index
            } else if (binaryValue >= 10) {
                finalValue = finalValue + 2;
                binaryValue = binaryValue - 10;

                //if the code hits here, then there is a 1 in the 0 index
            } else if (binaryValue >= 1 && binaryValue < 10) {
                finalValue = finalValue + 1;
                binaryValue = binaryValue - 1;

            }
        }

        return finalValue;
    }

    //convert binary to command
    public static String binaryToCommand(String binaryUnit) {
        //input is going to be like 111
        // Convert to String
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = binaryUnit.toCharArray();

        if (chars[0] == '1') {
            stringBuilder.append("r");
        } else {
            stringBuilder.append("-");
        }

        if (chars[1] == '1') {
            stringBuilder.append("w");
        } else {
            stringBuilder.append("-");
        }

        if (chars[2] == '1') {
            stringBuilder.append("x");
        } else {
            stringBuilder.append("-");
        }

        return stringBuilder.toString();

    }

    public static String octalToBinary(int octalValue) {
        //input is going to be like 7
        //set string builder
        StringBuilder stringBuilder = new StringBuilder();


        if(octalValue >= 4) {
            stringBuilder.append("1");
            octalValue = octalValue - 4;
        } else {
            stringBuilder.append("0");
        }

        if(octalValue >= 2) {
            stringBuilder.append("1");
            octalValue = octalValue - 2;
        } else {
            stringBuilder.append("0");
        }

        if(octalValue >= 1) {
            stringBuilder.append("1");
        } else {
            stringBuilder.append("0");
        }

        return stringBuilder.toString();
    }

    public static String commandToBinary(String command) {
        //ex. r-x
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = command.toCharArray();

        if (chars[0] == 'r') {
            stringBuilder.append("1");
        } else {
            stringBuilder.append("0");
        }

        if (chars[1] == 'w') {
            stringBuilder.append("1");
        } else {
            stringBuilder.append("0");
        }

        if (chars[2] == 'x') {
            stringBuilder.append("1");
        } else {
            stringBuilder.append("0");
        }

        return stringBuilder.toString();
    }


}
