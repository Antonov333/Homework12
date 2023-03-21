public class Main {
    public static void main(String[] args) {
        System.out.println("\nHi!\nHomework12 is in progress... ))\n");
        Bicycle myBike = new Bicycle("mountain bike", 26.0f, 20.0f);
        System.out.println("My bicycle is " + myBike.getType() + " with " + myBike.getWheelSize() + "\" wheels and " +
                myBike.getFrameSize() + "\" frame\n");
    }
}