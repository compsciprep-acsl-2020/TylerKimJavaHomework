package w3resourceHomework;

public class Main {

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
