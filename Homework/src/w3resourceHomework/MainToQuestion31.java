package w3resourceHomework;

public class MainToQuestion31 {

    public static void main(String args[]) {
        Question1 ans1 = new Question1("Java Exercises!", 0);
        Question2 ans2 = new Question2("w3resource.com", 1);
        Question3 ans3 = new Question3("w3resource.com", 1);
        Question4 ans4 = new Question4("w3rsource.com", 1, 10);
        Question5 ans5 = new Question5("This is Exercise 1", "This is Exercise 2");
        Question6 ans6 = new Question6("This is exercise 1", "This is Exercise 1");
        Question7 ans7 = new Question7("PHP Exercises and ", "Python Exercises");
        Question8 ans8 = new Question8("PHP Exercises and Python Exercises", "and");
        Question9 ans9 = new Question9("example.com", "Example.com");
        Question10 ans10 = new Question10("Example.com", changeStringToStringBuffer("example.com"));
        Character[] characterArray = {'1', '2', '3', '4'};
        Question11 ans11 = new Question11(characterArray);
        Question12 ans12 = new Question12("Python Exercise", "se");
        Question13 ans13 = new Question13("Stephen Edwin King", "Mike Royko");
        Question14 ans14 = new Question14("Stephen Edwin King", "stephen edwin king");
        Question15 ans15 = new Question15();
        Question16 ans16 = new Question16("The new String");
        Question17 ans17 = new Question17("This is the sample string.");
        Question18 ans18 = new Question18("Python Exercises.");
        Question19 ans19 = new Question19("The quick brown fox jumps over the lazy dog.");
        Question20 ans20 = new Question20("Java Exercises", changeStringToStringBuffer("Java Exercises"));
        Question21 ans21 = new Question21("The quick brown fox jumps over the lazy dog");
        Question22 ans22 = new Question22("example.com");
        Question23 ans23 = new Question23("Shanghai Houston Colorado Alexandria", "Alexandria Colorado Houston Shanghai");
        Question24 ans24 = new Question24("The quick brown fox jumps over the lazy dog");
        Question25 ans25 = new Question25("The quick brown fox jumps over the lazy dog", "fox", "cat");
        Question26 ans26 = new Question26("Orange is also my favorite color.", "Red");
        Question27 ans27 = new Question27("The quick brown fox jumps over the lazy dog.", 10, 26);
        Question28 ans28 = new Question28("Java Exercises.");
        Question29 ans29 = new Question29("The Quick BroWn FoX");
        Question30 ans30 = new Question30("The Quick BroWn FoX!");
        Question31 ans31 = new Question31(" Java Exercises ");


        //question 1
        System.out.println("Answer 1:");
        System.out.println(ans1.charAt());
        System.out.println(" ");

        //question 2
        System.out.println("Answer 2:");
        System.out.println(ans2.charAt());
        System.out.println(" ");

        //question3
        System.out.println("Answer 3:");
        System.out.println(ans3.unicodeValueBeforeIndex());
        System.out.println(" ");


        //question 4
        System.out.println("Answer 4:");
        System.out.println(ans4.unicodeCodePoints());
        System.out.println(" ");


        //question 5
        System.out.println("Answer 5:");
        System.out.println(ans5.lexicographicalComparater());
        System.out.println(" ");


        //question 6
        System.out.println("Answer 6:");
        System.out.println(ans6.lexicographicalComparatorWithoutCaseDifference());
        System.out.println(" ");


        //question 7
        System.out.println("Answer 7:");
        System.out.println(ans7.concatenateString());
        System.out.println(" ");

        //question 8
        System.out.println("Answer 8:");
        System.out.println(ans8.testForSequenceOfStrings());
        System.out.println(" ");

        //question 9
        System.out.println("Answer 9:");
        System.out.println(ans9.compareString());
        System.out.println(" ");

        //question 10
        System.out.println("Answer 10:");
        System.out.println(ans10.compareStringBuffer());
        System.out.println(" ");

        //Question 11
        System.out.println("Answer 11:");
        System.out.println(ans11.characterArrayToString().toString());
        System.out.println(" ");

        //Question 12
        System.out.println("Answer 12:");
        System.out.println(ans12.containerTest());
        System.out.println(" ");

        //Question 13
        System.out.println("Answer 13:");
        System.out.println(ans13.sameDataTester());
        System.out.println(" ");

        //Question 14
        System.out.println("Answer 14:");
        System.out.println(ans14.firstString + " equals " + ans14.secondString + "?" + " " + ans14.compareStringsIgnoringCase());
        System.out.println(" ");

        //Question 15
        System.out.println("Answer 15: ");
        System.out.println(ans15.datePrinter());
        System.out.println(" ");

        //Question 16
        System.out.println("Answer 16: ");
        System.out.println(ans16.stringToByteArray());
        System.out.println(" ");

        //Question 17
        System.out.println("Answer 17: ");
        System.out.println(ans17.getCharacterArray());
        System.out.println(" ");

        //Question 18
        System.out.println("Question 18: ");
        System.out.println("The hash code for " + ans18.input + " is " + ans18.hashCodeFromString());
        System.out.println(" ");

        //Question 19
        System.out.println("Question 19: ");
        System.out.println(ans19.characterIndexer());
        System.out.println(" ");

        //Question 20
        System.out.println("Question 20: ");
        System.out.println("str1 == str2? " + ans20.compareCanonicalRepresentationOfStrings().get(0) + "\nstr1 == str3? " + ans20.compareCanonicalRepresentationOfStrings().get(1));
        System.out.println(" ");

        //Question21
        System.out.println("Question 21: ");
        System.out.println(ans21.lastIndex());
        System.out.println(" ");

        //Question 22
        System.out.println("Question 22: ");
        System.out.println(ans22.length());
        System.out.println(" ");

        //Question 23
        System.out.println("Question 23: ");
        System.out.println(ans23.stringMatcher());
        System.out.println(" ");

        //Question 24
        System.out.println("Question 24: ");
        System.out.println(ans24.switchDToF());
        System.out.println(" ");

        //Question 25
        System.out.println("Question 25: ");
        System.out.println(ans25.wordReplacer());
        System.out.println(" ");

        //Question 26
        System.out.println("Question 26: ");
        System.out.println(ans26.input + " starts with " + ans26.testingValue + "?  " + ans26.testIfStartWithString());
        System.out.println(" ");

        //Question 27
        System.out.println("Question 27: ");
        System.out.println(ans27.stringFromGivenRange());
        System.out.println(" ");

        //Question 28
        System.out.println("Question 28: ");
        System.out.println(ans28.getCharacterArray());
        System.out.println(" ");

        //Question 29
        System.out.println("Question 29: ");
        System.out.println(ans29.convertToAllLowerCase());
        System.out.println(" ");

        //Question 30
        System.out.println("Question 30: ");
        System.out.println(ans30.convertToAllUpperCase());
        System.out.println(" ");

        //Question 31
        System.out.println("Question 31: ");
        System.out.println(ans31.whiteSpaceTrimmer());
        System.out.println(" ");

        //Question 32

        //Question 33

        //Question 34

        //Question 35

        //Question 36

        //Question 37

        //Question 38

        //Question 39

        //Question 40
    }

    public static StringBuffer changeStringToStringBuffer(String input) {
        String[] changedInput = input.split("");
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < changedInput.length; i++) {
         stringBuffer.append(changedInput[i]);
        }

        return stringBuffer;
    }
}
