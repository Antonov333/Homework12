package Package12;

import java.util.Arrays;

public class Homework12 {

        public static void main(String[] args) {
        int homeworkNumber = 12 ;
        printTitle(homeworkNumber);

        Author beaumarchais = new Author("Пьер", "Бомарше") ;
       // System.out.println(Beaumarchais.getFirstName()+" "+Beaumarchais.getLastname());

        Book marriageOfFigaro = new Book("Figaro", beaumarchais,2015) ;
        
        marriageOfFigaro.setName("Безумный день, или Женитьба Фигаро (сборник)");
        Author writer = marriageOfFigaro.getAuthor();
        System.out.println("Автор книги: " + writer.getFirstName()+ " " + writer.getLastname());
        System.out.println("Название: " + marriageOfFigaro.getName());
        System.out.println("Год издания: " + marriageOfFigaro.getYearOfPublishing() + "\n");

        Author baltiAndGalloway = new Author("Haythem Balti,", "Alan Galloway") ;

        Book jobReadyJava = new Book("Job Ready Java", baltiAndGalloway , 0);
        jobReadyJava.printBookInfo();
        jobReadyJava.setYearOfPublishing(2021);
        System.out.println("");
        jobReadyJava.printBookInfo();

        printBottomMessage(homeworkNumber, "в работе");

    }
    public static void printTitle(int homeworkNo) {
        System.out.println("\nДомашнее задание "+homeworkNo+"\n");
    }

    public static void printBottomMessage(int homeworkNo, String status) {
        System.out.println("\nДомашнее задание " + homeworkNo + " " + status + "\n");
    }
}
