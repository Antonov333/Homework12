package pro.sky.java.course1.lesson12_classes_and_objects;

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
        return firstName == sample.firstName && lastName == sample.lastName;
    }

}
