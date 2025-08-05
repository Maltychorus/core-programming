import java.util.*;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added. Total: " + quantity);
    }

    public void removeItem(int qty) {
        if (qty >= quantity) {
            System.out.println("Removing all " + itemName + "(s) from cart.");
            quantity = 0;
        } else {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed. Remaining: " + quantity);
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + calculateTotalCost());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cartItem = new CartItem("Laptop", 50000, 1);

        System.out.println("=== Shopping Cart Demo ===");
        cartItem.displayItem();

        System.out.print("Enter quantity to add: ");
        int addQty = sc.nextInt();
        cartItem.addItem(addQty);
        cartItem.displayItem();

        System.out.print("Enter quantity to remove: ");
        int removeQty = sc.nextInt();
        cartItem.removeItem(removeQty);
        cartItem.displayItem();

        System.out.println("Final Total Cost: " + cartItem.calculateTotalCost());
        sc.close();
    }
}
