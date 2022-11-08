public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        MovingObjects a = new MovingObjects(1, 3);
        System.out.println("A moving object has been created.");

        System.out.println("It's current position is:");
        System.out.println("X >  " + a.getPosX());
        System.out.println("Y >  " + a.getPosY());
        System.out.println();

        a.update();
        System.out.println("The object has moved.");
        System.out.println("It's current position is:");
        System.out.println("X >  " + a.getPosX());
        System.out.println("Y >  " + a.getPosY());

    }
}