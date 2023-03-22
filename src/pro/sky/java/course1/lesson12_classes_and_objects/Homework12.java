package pro.sky.java.course1.lesson12_classes_and_objects;

public class Homework12 {

    public static void main(String[] args) {
        int homeworkNumber = 12;
        printTitle(homeworkNumber);

        Author beaumarchais = new Author("Пьер", "Бомарше");
        Book marriageOfFigaro = new Book("Figaro", beaumarchais, 2015);
        marriageOfFigaro.printBookInfo();
        marriageOfFigaro.setName("Безумный день, или Женитьба Фигаро (сборник)");
        marriageOfFigaro.printBookInfo();

        Author baltiAndGalloway = new Author("Haythem Balti,", "Alan Galloway");

        Book jobReadyJava = new Book("Job Ready Java", baltiAndGalloway, 0);
        jobReadyJava.printBookInfo();
        jobReadyJava.setYearOfPublishing(2021);
        jobReadyJava.printBookInfo();

        printBottomMessage(homeworkNumber, "в работе");


    }

    public static void printTitle(int homeworkNo) {
        System.out.println("\nДомашнее задание " + homeworkNo + "\n");
    }

    public static void printBottomMessage(int homeworkNo, String status) {
        System.out.println("Домашнее задание " + homeworkNo + " " + status + "\n");
    }
}
