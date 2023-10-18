package com.pluralsight;
import java.util.*;
public class SearchInventory {
//Once established, set up the main
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Product> inventory = getInventory();
        for (Product product : inventory) {
            System.out.println(product);

        }
    }
    //Everybody loves Array-mond
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product("Hammer", 19.49, 50));
        inventory.add(new Product("Box of Nails", 9.29, 30));
        inventory.add(new Product("Mechanics Tool Set", 119.00, 20));
        inventory.add(new Product("10' 2x4 (grade B)", 9.99, 40));
        inventory.add(new Product("9-in-1 Ratcheting Screwdriver", 24.97, 15));
        return inventory;
    }
//Set up the variables Jamie
}
class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product: " + name + " | Price: $" + price + " | Quantity: " + quantity;
    }
}