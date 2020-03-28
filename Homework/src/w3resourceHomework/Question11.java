package w3resourceHomework;

public class Question11 {

    Character[] characterArray;

    public Question11(Character[] characterArray) {
        this.characterArray = characterArray;
    }

    public String characterArrayToString() {
       StringBuilder stringBuilder = new StringBuilder();

       for(int i = 0; i < characterArray.length; i++) {
           stringBuilder.append(characterArray[i]);
       }

       String str = stringBuilder.toString();
        return "This books has " + str + " pages.";
    }
}
