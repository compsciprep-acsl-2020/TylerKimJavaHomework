package constructorPractice;

public class nameFinder {



    public static void main(String args[]) {
        String name = "hi";
        nameFinder nameText = new nameFinder();
        nameText.getName(name);
    }

    public void getName(String name) {
        System.out.println(name);
    }

}
