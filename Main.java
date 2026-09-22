package canteen;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
		    System.out.println("CANTEEN ORDER SYSTEM");
		    System.out.println("1. Place an order");
		    System.out.println("2. Exit");
		    System.out.print("Enter choice: ");
		    choice = scanner.nextInt();

		    if (choice == 1) {

		        System.out.print("How many items are you buying? ");
		        int numberOfItems = scanner.nextInt();

		        while (numberOfItems <= 0) {
		            System.out.print("Enter a number greater than 0: ");
		            numberOfItems = scanner.nextInt();
		        }

		        double totalCost = 0;

		        for (int i = 1; i <= numberOfItems; i++) {
		            System.out.print("Enter price of item " + i + ": ");
		            double price = scanner.nextDouble();
		            totalCost += price;
		        }

		        String discountMessage = (totalCost >= 20000) ? "You qualify for a discount!" : "No discount today.";

		        System.out.println("Total cost: " + totalCost);
		        System.out.println(discountMessage);

		    } else if (choice == 2) {
		        System.out.println("Thank you for visiting the canteen!");
		    } else {
		        System.out.println("Invalid choice.");
		    }

		} while (choice != 2);

		scanner.close();

	}

}
