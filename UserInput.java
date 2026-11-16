import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Full name: ");
        String name = scanner.nextLine();
        

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Balance: RM ");
        double balance = scanner.nextDouble();

        System.out.println("Hi " + name + ", age " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Balance: RM " + balance);
        scanner.close();
    }
}
