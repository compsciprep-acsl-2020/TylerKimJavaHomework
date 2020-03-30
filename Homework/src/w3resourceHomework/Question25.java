package w3resourceHomework;

public class Question25 {

    String input;
    String oldValue;
    String substitute;

    public Question25(String input, String oldValue, String substitute) {
        this.input = input;
        this.oldValue = oldValue;
        this.substitute = substitute;
    }

    public String wordReplacer() {
        String output = input.replace(oldValue, substitute);

        return "Original String: " + input + "\nNew String: " + output;
    }
}
