package constructorPractice;

public class ArithmaticOperations {

    int x;
    int y;
    int z;

    public ArithmaticOperations(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public int additionOperation() {
        int output = x + y + z;
        return output;
    }

    public int subtractionOperation() {
        int output = x - y - z;
        return output;
    }

    public int multiplicationOperation() {
        int output = x * y * z;
        return output;
    }

    public int divisionOperation() {
        int output = x/y/z;
        return output;
    }



}
