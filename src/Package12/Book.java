package Package12;

public class Book {
    private String name ;
    private Author author ;
    private int yearOfPublishing ;

    public Book (String bookName, Author writer, int year) {
        this.name = bookName;
        this.author = writer;
        this.yearOfPublishing = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setAuthor(Author authorOfBook) {
        this.author = authorOfBook ;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void printBookInfo() {
        System.out.println("Автор: " + this.author.getFirstName() + this.author.getLastname());
        System.out.println("Название: " + this.getName());
        System.out.println("Год издания: " + this.getYearOfPublishing());
    }

}
