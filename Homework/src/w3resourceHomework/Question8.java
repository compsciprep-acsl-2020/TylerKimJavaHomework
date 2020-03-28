package w3resourceHomework;

public class Question8 {

    String stringValue;
    String sequence;

    public Question8(String stringValue, String sequence) {
        this.stringValue = stringValue;
        this.sequence = sequence;
    }

    public boolean testForSequenceOfStrings() {
        boolean output = stringValue.contains(sequence);

        return output;
    }
}
