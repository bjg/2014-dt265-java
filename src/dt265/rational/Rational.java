package dt265.rational;

/**
 * Created by brian on 30/03/2014.
 */
public class Rational {
    private int numerator, denominator;

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";	// Coercion of int to String
        }
        return numerator + "/" + denominator;
    }

    // The following method is required to allow JUnit to do equality checking
    @Override
    public boolean equals(Object o) {
        // Assume they're not equal
        boolean isEqual = false;

        // Equal if they are of the same type and numerators/demoninators are equal
        if (o instanceof Rational) {
            isEqual = (numerator == ((Rational) o).numerator) &&
                      (denominator == ((Rational) o).denominator);
        }
        return isEqual;
    }
}
