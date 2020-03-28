package w3resourceHomework;

public class Question7 {

    String firstAddend;
    String secondAddend;

    public Question7(String firstAddend, String secondAddend)  {
        this.firstAddend = firstAddend;
        this.secondAddend = secondAddend;
    }

    public String concatenateString() {
        String output = firstAddend.concat(secondAddend);

        return output;
    }
}
