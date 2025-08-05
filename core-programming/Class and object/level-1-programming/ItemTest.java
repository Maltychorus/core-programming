class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemTest {
    public static void main(String[] args) {
        Item item = new Item(101, "Notebook", 50.0);
        item.displayItem();
        int quantity = 3;
        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
    }
}