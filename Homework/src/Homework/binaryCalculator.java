package Homework;

import java.util.ArrayList;

public class binaryCalculator {

    public static void main(String args[]) {
        System.out.println(isSemiPerfect(840));
    }







//**************************************************************************************************************************
//********A**********************CCCCCCCCCCCCCC********************SSSSSSSSSSSSSS**********************L*******************
//*******A*A*********************C*********************************S***********************************L*******************
//******A***A********************C*********************************S***********************************L*******************
//*****A*****A*******************C*********************************S***********************************L*******************
//****A*******A******************C*********************************SSSSSSSSSSSSSS**********************L*******************
//***AAAAAAAAAAA*****************C**********************************************S**********************L*******************
//**A***********A****************C**********************************************S**********************L*******************
//*A*************A***************C**********************************************S**********************L*******************
//A***************A**************CCCCCCCCCCCCCCC********************SSSSSSSSSSSSS**********************LLLLLLLLLLLLLLLLLLLL
//*************************************************************************************************************************

    public static boolean isSemiPerfect(int x) {
        ArrayList<Integer> xDivisors = findDivisors(x);
        for(int i = 1; i < Math.pow(2, xDivisors.size()); i++) {
            String binaryString = Integer.toBinaryString(i);
            while(binaryString.length() != xDivisors.size()) {
                binaryString = "0" + binaryString;
            }
            int sum = 0;
            char[] binaryStringArr = binaryString.toCharArray();
            for(int j = 0; j < binaryStringArr.length; j++) {
                if(binaryStringArr[j] == '1') {
                    sum += xDivisors.get(j);
                }
            }
            if(sum == x) {
                return true;
            }
        }
    return false;
    }

//***************************************************************************************







    public static ArrayList<Integer> findDivisors(int x) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i = 1; i < x; i++) {
            if(x % i == 0) {
                divisors.add(i);
            }

        }

        return divisors;

    }



}
