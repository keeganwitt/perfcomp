package perfcomp.java;

/**
 * Created by rahul on 7/10/15.
 */
public class Person {
    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
