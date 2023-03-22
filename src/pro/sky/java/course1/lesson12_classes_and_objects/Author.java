package pro.sky.java.course1.lesson12_classes_and_objects;

public class Author {
    private String firstName;
    private String lastname ;
    public Author(String first, String last) {
        firstName = first ;
        lastname = last ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }
}
