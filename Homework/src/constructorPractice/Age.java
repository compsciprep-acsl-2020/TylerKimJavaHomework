package constructorPractice;

import javax.swing.plaf.IconUIResource;

public class Age {
    private int currentAge;

    public Age(int currentAge) {
        this.currentAge = currentAge;
    }


    public int getAge() {
        return currentAge;
    }

}
