public class Main {
    public static int homeworkNumber = 12;
    public static void main(String[] args) {
        printTitle(homeworkNumber);

        startingWithObljectsAndClasses() ;

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

    public static void startingWithObljectsAndClasses() {
        Bicycle myBike = new Bicycle("mountain bike", 26.0f, 20.0f);
        System.out.println("My bicycle is " + myBike.getType() + " with " + myBike.getWheelSize() + "\" wheels and " +
                myBike.getFrameSize() + "\" frame\n");
    }
}