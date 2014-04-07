package dt265.triangle;

/**
 * Created by brian on 07/04/2014.
 */
public class Triangle {
    static int triangleCount;

    private int number;
    private String type = "Triangle";       // Immutable
    private double base, verticalHeight;

    Triangle() {
        this(0.0, 0.0);
    }

    Triangle(double base, double verticalHeight) {
        triangleCount++;
        number = triangleCount;
        this.base = base;
        this.verticalHeight = verticalHeight;
    }

    public static int getTriangleCount() {
        return triangleCount;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getVerticalHeight() {
        return verticalHeight;
    }

    public void setVerticalHeight(double verticalHeight) {
        this.verticalHeight = verticalHeight;
    }

    public double getArea() {
        return 0.5 * base * verticalHeight;
    }

    @Override public String toString() {
        return type + " number=" + number + " base=" + base + " height=" + verticalHeight;
    }
}
