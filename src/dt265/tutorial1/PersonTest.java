package dt265.tutorial1;

/**
 * Created by brian on 31/03/2014.
 */

public class PersonTest {
    public static void main(String args[]) {
        // Create a person object with the specified name
        Person person = new Person("Joe Blogs");

        // Print that name out
        System.out.println(person.getName());

        // Now change the name of that person and print it again
        person.setName("John Smith");
        System.out.println(person.getName());
    }
}
