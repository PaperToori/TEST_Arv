import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Remove comment slashes and run code to try examples. avatarTest requires terminal input.

        // objectTest();
        // jediTest();
        // avatarTest();


    }

    // Methods
    public static void objectTest(){

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

    public static void jediTest(){

        Jedi aa = new Jedi("Abakin");
        Sith bb = new Sith("Greebius");
        System.out.println("A Jedi and Sith has been created.");

        System.out.println("The first Force user is:");
        System.out.println("Name       >  " + aa.name);
        System.out.println("Affiliaton >  " + aa.ForceSide());
        System.out.println();

        System.out.println("The second Force user is:");
        System.out.println("Name       >  " + bb.name);
        System.out.println("Affiliaton >  " + bb.ForceSide());
        System.out.println();

    }

    public static void avatarTest(){
        Scanner inP = new Scanner(System.in);

        System.out.println("How much health does the avatar have?");
        Avatar a = new Avatar( Integer.parseInt(inP.next()) );

        System.out.println("How much does a health potion heal?");
        HealthPotion h = new HealthPotion( Integer.parseInt(inP.next()) );

        System.out.println("How much harm does poison do?");
        Poison p = new Poison( Integer.parseInt(inP.next()) );

        System.out.println();
        System.out.println("The Avatar has " + a.hitpoints + " hitpoints.");
        System.out.println("The Avatar drinks the poison.");
        p.use(a);
        System.out.println("The Avatar now has " + a.hitpoints + " hitpoints.");
        if (a.hitpoints < 1) {
            System.out.println("The Avatar is dead.");
        } else {
            System.out.println("The Avatar drinks the health potion.");
            h.use(a);
            System.out.println("The Avatar now has " + a.hitpoints + " hitpoints.");
            System.out.println("The Avatar lives.");
        }


    }
}
