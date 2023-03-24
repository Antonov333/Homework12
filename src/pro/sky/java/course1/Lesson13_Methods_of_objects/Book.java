package pro.sky.java.course1.Lesson13_Methods_of_objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublishing;

    public Book() {
    }

    public Book(String bookName, Author writer, int year) {
        this.name = bookName;
        this.author = writer;
        this.yearOfPublishing = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author authorOfBook) {
        this.author = authorOfBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void printBookInfo() {
        System.out.println("Автор: " + this.author.getFirstName() + " " + this.author.getLastname());
        System.out.println("Название: " + this.getName());
        System.out.println("Год издания: " + this.getYearOfPublishing());
        System.out.println();
    }

    public String toString() {
        return author.toString() + " \"" + name + "\" " + yearOfPublishing;
    }

    public boolean equals(Book sample) {
        return sample != null
                && author.equals(sample.getAuthor())
                && name.equals(sample.getName())
                && yearOfPublishing == sample.yearOfPublishing;

    }

    public int hashCode() {
        int magnifier = 17;
        return (name.hashCode() + author.hashCode() + yearOfPublishing) * magnifier;
    }

}
