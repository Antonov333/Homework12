package Package12;

public class Homework12 {

    public static int homeworkNumber = 12;
    public static void main(String[] args) {
        printTitle(homeworkNumber);

        Author Beaumarchais = new Author("Пьер", "Бомарше") ;
        System.out.println(Beaumarchais.getFirstName()+" "+Beaumarchais.getLastname());


        printBottomMessage(homeworkNumber, "в работе");



    }
    public static void printTitle(int homeworkNo) {
        System.out.println("\nДомашнее задание "+homeworkNo+"\n");
    }

    public static void printBottomMessage(int homeworkNo, String status) {
        System.out.println("\nДомашнее задание " + homeworkNo + " " + status + "\n");
    }
}
