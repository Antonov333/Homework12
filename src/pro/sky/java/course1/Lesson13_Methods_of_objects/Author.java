package pro.sky.java.course1.Lesson13_Methods_of_objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Author sample) {
        return sample != null && firstName == sample.firstName && lastName == sample.lastName;
    }

    public int hashCode() {
        int magnifier = 7;
        return magnifier * (firstName.hashCode() + lastName.hashCode());
    }


}
