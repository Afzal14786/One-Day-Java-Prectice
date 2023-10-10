import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:_ ");
        String name = scan.nextLine();
        System.out.println("name:_" + name);
        System.out.println("Enter your Password:_");
        String pass =scan.nextLine();
        System.out.println("Password:_" + pass);
        System.out.println("Enter your E-mail");
        String mail = scan.nextLine();
        System.out.println("Your mail is:_" + mail);
        System.out.println("Enter your phone number");
        long number = scan.nextLong();
        System.out.println("your phone number is:_ " + number);
        System.out.println("Enter your presentage");
        double present = scan.nextDouble();
        System.out.println("Your Presentage is:_"  + present);
    }
}