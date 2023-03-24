package pro.sky.java.course1.Lesson13_Methods_of_objects;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание 13\nМЕТОДЫ ОБЪЕКТОВ\n");

        Author goldsmith = new Author("Oliver", "Goldsmith");
        Book theTraveller = new Book("The Traveller", goldsmith, 2010);
        System.out.println(theTraveller + "\n");

        Author goethe = new Author("Johann Wolfgang", "von Goethe");
        Author sample = goethe;
        System.out.println("goethe: \t" + goethe + " " + goethe.hashcode());
        System.out.println("sample: \t" + sample + " " + sample.hashcode());
        System.out.println(goethe.equals(sample) + "\n");

        System.out.println("goldsmith: \t" + goldsmith + " " + goldsmith.hashcode());
        System.out.println("sample: \t" + sample + " " + sample.hashcode());
        System.out.println(goldsmith.equals(sample));


        Book faust = new Book("Faust", goethe, 1981);
        Book otherBook = faust;


        System.out.println("\n" + theTraveller + " " + theTraveller.hashCode());
        System.out.println(otherBook + " " + otherBook.hashCode());
        System.out.println(theTraveller.equals(otherBook) + "\n");

        otherBook = theTraveller;
        System.out.println(theTraveller + " " + theTraveller.hashCode());
        System.out.println(otherBook + " " + otherBook.hashCode());
        System.out.println(theTraveller.equals(otherBook));

        System.out.println("\nДомашнее задание 13 выполнено\n");

    }
}
