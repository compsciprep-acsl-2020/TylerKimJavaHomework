package constructorPractice;

public class EntryPoint {
    public static void main(String args[]) {
        FahreinheitToCelsiusConverter converter = new FahreinheitToCelsiusConverter(32, 32);
        System.out.println(converter.CelsiusToFahrienheitConvertor());
        System.out.println(converter.FahreinheitToCelsiusConvertor());

        Age ageDisplayer = new Age(7);
        System.out.println(ageDisplayer.getAge());

        ArithmaticOperations operator = new ArithmaticOperations(2, 4, 6);
        System.out.println(operator.additionOperation());
        System.out.println(operator.subtractionOperation());
        System.out.println(operator.multiplicationOperation());
        System.out.println(operator.divisionOperation());

    }
}
