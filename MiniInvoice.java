import java.util.Scanner;

public class MiniInvoice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Type your quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Type the name of the item: ");
        String item = scanner.nextLine();
        
        System.out.print("Type the price: ");
        double price = scanner.nextDouble();

        System.out.print("Type the discount: ");
        int discountPercent = scanner.nextInt();

        double subtotal = quantity * price;

        double discount = subtotal * (discountPercent / 100.0);
        double afterDiscount = subtotal - discount;
        double tax = afterDiscount * 0.06;

        double total = afterDiscount + tax;

        System.out.println("Item: " + item);
        System.out.println("Subtotal: RM " + subtotal);
        System.out.println("Discount: RM " + discount);
        System.out.println("Tax (6%): RM " + tax);
        System.out.println("Total: RM " + total);
        scanner.close();

    }
}
