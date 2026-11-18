import java.util.Scanner;

public class ShopStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shop owner's name: ");
        String owner = scanner.nextLine();

        System.out.print("Number of cats in the shop: ");
        int cats = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Funniest product: ");
        String product = scanner.nextLine();

        System.out.print("Its price: RM ");
        double price = scanner.nextDouble();

        System.out.println(owner + " runs a shop with " + cats + " cats.");
        System.out.println("Next year there will be " + (cats + 2) + " cats!");
        System.out.println("The best seller is " + product + " for RM " + price);
        System.out.println("Thank you for visiting!");
        scanner.close();

    }
}