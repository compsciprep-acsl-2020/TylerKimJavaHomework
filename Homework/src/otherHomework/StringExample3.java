package otherHomework;

import java.util.ArrayList;
import java.util.List;

public class StringExample3 {
   public String name = "w3resource.com";

   private final int notChange = 1;
   private final List<Integer> testArray = new ArrayList();

    public StringExample3(String name) {
        this.name = name;
    }


    public String alternatingLetters(String string) {

        char[] output = new char[string.length()/2];
        int x = 0;



        return "Correct";


    }



    public static void main(String args[]) {
        String example = "tester";
        StringExample3 testConstructor = new StringExample3("test");
        System.out.println(testConstructor.alternatingLetters(example));
    }

}