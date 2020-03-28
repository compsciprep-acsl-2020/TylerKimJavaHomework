package constructorPractice;

public class FahreinheitToCelsiusConverter {
   private double fahrienheit;
   private double celsius;

    public FahreinheitToCelsiusConverter(double fahreinheit, double celsius) {
        this.fahrienheit = fahreinheit;
        this.celsius = celsius;
    }

    public double FahreinheitToCelsiusConvertor() {
        double output = (5/9) * (fahrienheit - 32);

      return output;
    }

    public double CelsiusToFahrienheitConvertor() {
        double output = (9/5) * (celsius + 32);

        return output;
    }


}
