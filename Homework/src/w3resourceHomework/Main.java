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
