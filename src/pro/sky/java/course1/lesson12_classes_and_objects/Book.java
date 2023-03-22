package pro.sky.java.course1.lesson12_classes_and_objects;

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

}
