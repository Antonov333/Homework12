package pro.sky.java.course1.Lesson13_Methods_of_objects;

import pro.sky.java.course1.lesson12_classes_and_objects.Author;
import pro.sky.java.course1.lesson12_classes_and_objects.Book;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\nJust started with homework 13 with Methods of objects\n");

        Author goldsmith = new Author("Oliver", "Goldsmith");
        Book theTraveller = new Book("The Traveller", goldsmith, 2010);
        System.out.println(theTraveller + "\n");

        Author goethe = new Author("Johann Wolfgang", "von Goethe");
        Author sample = goethe;
        System.out.println("goethe: \t" + goethe);
        System.out.println("sample: \t" + sample);
        System.out.println(goethe.equals(sample));

        Book faust = new Book("Faust", goethe, 1981);
        Book otherBook = faust;


        System.out.println("\n" + theTraveller + " " + theTraveller.hashCode());
        System.out.println(otherBook + " " + otherBook.hashCode());
        System.out.println(theTraveller.equals(otherBook) + "\n");

        otherBook = theTraveller;
        System.out.println(theTraveller + " " + theTraveller.hashCode());
        System.out.println(otherBook + " " + otherBook.hashCode());
        System.out.println(theTraveller.equals(otherBook));

    }
}
