import java.util.Scanner;

public class MadLibs {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");  
        String name = scanner.nextLine();

        System.out.print("What is the animal you choose: ");
        String animal = scanner.nextLine();

        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Type of food: ");
        String food = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.println("----------------------------------------------------------------");
        System.out.println(name + " runs a shop with animal pets ( " + animal + "/s) " );
        System.out.println("Next year there will be " + (num + 2 ) + (" ") + animal + " /s!");
        System.out.println("The " + food + " for the " + animal + "/s are RM " + price);
        System.out.println("Thank you for visiting!");
        System.out.println("----------------------------------------------------------------");
        scanner.close();
   }
}
