import java.util.Scanner;

public class CustomerWelcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Full name: ");
        String name = scanner.nextLine();
        
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Visits: ");
        int visits = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Favourite drink: ");
        String drink = scanner.nextLine();

        System.out.println("\n\nWelcome back, " + name + "!");
        System.out.println("Phone: " + phone);
        System.out.println("Previous visits: " + visits);
        System.out.println("Your usual: " + drink);
        scanner.close();
    }
}
