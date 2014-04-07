package dt265.triangle;

/**
 * Created by brian on 07/04/2014.
 */
public class TriangleTest {
    public static void main(String args[]) {
        Triangle triangle1 = new Triangle();
        triangle1.setBase(5.0);
        triangle1.setVerticalHeight(4.0);

        Triangle triangle2 = new Triangle(8.0, 5.0);

        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
