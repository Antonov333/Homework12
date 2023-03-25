package pro.sky.java.course1.Lesson13_Methods_of_objects;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublishing);
    }

}
