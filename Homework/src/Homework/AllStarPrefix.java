package Homework;

import javafx.beans.property.IntegerProperty;

public class AllStarPrefix {

    public static void main(String args[]) {

        String test = "AF8";
        System.out.println(formPrefixes(formBinaryComposition(test)));
    }


    //core methods
        //form binary composition
    public static String formBinaryComposition(String hexVal) {
        String[] arr = hexVal.split("");
        String output = convertHexToBinary(arr[0]);

        for(int i = 1; i < hexVal.length(); i++) {
            output = output + convertHexToBinary(arr[i]);
        }

        return output;

    }

        //form to prefixes
    public static String formPrefixes(String binaryVal) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder tempValue = new StringBuilder();


        for(int i = 0; i < binaryVal.length(); i++) {
            if(Integer.parseInt(binaryVal.substring(i, i+1)) == 0) {
                tempValue.append("0");
            } else {
                tempValue.append("1");
            }

            switch(tempValue.toString()) {
                case "0":
                    stringBuilder.append("P");
                    tempValue.setLength(0);
                    break;

                case "10":
                    stringBuilder.append("Q");
                    tempValue.setLength(0);
                    break;

                case "110":
                    stringBuilder.append("R");
                    tempValue.setLength(0);
                    break;

                case "1110":
                    stringBuilder.append("S");
                    tempValue.setLength(0);
                    break;

                case "1111":
                    stringBuilder.append("T");
                    tempValue.setLength(0);
            }
        }

        return stringBuilder.toString();

    }

    //supplementaryMethod
        //convert single hex to binary
    public static String convertHexToBinary(String binary) {
        int hexVal = Integer.parseInt(binary, 16);
        String hex = Integer.toBinaryString(hexVal);

        //check
        while(hex.length() < 4) {
            hex = "0" + hex;
        }

        return hex;
    }




}
