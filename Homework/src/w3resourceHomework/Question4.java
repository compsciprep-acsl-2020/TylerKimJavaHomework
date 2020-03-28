package w3resourceHomework;

public class Question4 {
    String input;
    int minRang;
    int maxRang;

    public Question4(String input, int minRang, int maxRang) {
        this.input = input;
        this.minRang = minRang;
        this.maxRang = maxRang;
    }

    public int unicodeCodePoints() {
        int output = input.codePointCount(minRang, maxRang);
        return output;
    }

}
