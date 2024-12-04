import java.util.InputMismatchException;
import java.util.Scanner;

class RestroMenuBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prices of menu items
        int pizzaPrice = 500;
        int momosPrice = 600;
        int soupPrice = 599;
        int noodlesPrice = 650;

        // Display the menu
        System.out.println("Menu:");
        System.out.println("1. Pizza: RS " + pizzaPrice);
        System.out.println("2. Momos: RS " + momosPrice);
        System.out.println("3. Soup: RS " + soupPrice);
        System.out.println("4. Noodles: RS " + noodlesPrice);
        System.out.println("Type 'exit' to finish your order.");

        // Initialize total order price
        int orderTotal = 0;

        while (true) {
            System.out.print("Select food item: ");
            String selectedFood = sc.next().toLowerCase(); // Convert input to lowercase for case-insensitivity


            if (selectedFood.equals("exit")) {
                System.out.println("ORDER PLACED Successfully. Your total amount is RS " + orderTotal);
                sc.close();
                return; // Exit the program
            }



            // Process the order
            switch (selectedFood) {
                case "pizza":
                    try {
                        System.out.print("Enter quantity for Pizza: ");
                        int pizzaQuantity = sc.nextInt();
                        orderTotal += pizzaPrice * pizzaQuantity;
                        System.out.println("You have ordered " + pizzaQuantity + " Pizza(s) for RS " + (pizzaPrice * pizzaQuantity));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter Proper Quantity");
                        sc.next(); // Clear the invalid input
                    }
                    break;
                case "momos":
                    try {
                        System.out.print("Enter quantity for Momos: ");
                        int momosQuantity = sc.nextInt();
                        orderTotal += momosPrice * momosQuantity;
                        System.out.println("You have ordered " + momosQuantity + " Momos for RS " + (momosPrice * momosQuantity));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter Proper Quantity");
                        sc.next(); // Clear the invalid input
                    }
                    break;
                case "soup":
                    try {
                        System.out.print("Enter quantity for Soup: ");
                        int soupQuantity = sc.nextInt();
                        orderTotal += soupPrice * soupQuantity;
                        System.out.println("You have ordered " + soupQuantity + " Soup(s) for RS " + (soupPrice * soupQuantity));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter Proper Quantity");
                        sc.next(); // Clear the invalid input
                    }
                    break;
                case "noodles":
                    try {
                        System.out.print("Enter quantity for Noodles: ");
                        int noodlesQuantity = sc.nextInt();
                        orderTotal += noodlesPrice * noodlesQuantity;
                        System.out.println("You have ordered " + noodlesQuantity + " Noodle(s) for RS " + (noodlesPrice * noodlesQuantity));
                    } catch (InputMismatchException e) {
                        System.out.println("Enter Proper Quantity");
                        sc.next(); // Clear the invalid input
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid food item or type 'exit' to finish.");
                    break;
            }

            // Ask if the customer wants to order another item
            System.out.print("Do you want to order another item? (yes/no): ");
            String anotherOrder = sc.next().toLowerCase();
            if (!anotherOrder.equals("yes")) {
                System.out.println("ORDER PLACED Successfully. Your total amount is RS " + orderTotal);
                sc.close(); // Close the scanner
                return; // Exit the program
            }

        }
    }
}