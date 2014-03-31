package dt265.tutorial1;

/**
 * Created by brian on 31/03/2014.
 */
class Person {
    /*
     * Private to this class is the implementation detail that names
     * are stored in two parts
     */
    private String firstName, givenName;

    /*
     * Single argument constructor
     */
    Person(String name) {
        setName(name);
    }

    /*
     * Getter method
     */
    public String getName() {
        return firstName + " " + givenName;
    }

    /*
     * Setter method
     */
    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.givenName = parts[1];
    }
}

