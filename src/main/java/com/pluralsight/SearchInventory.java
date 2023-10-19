package com.pluralsight;
import java.util.*;
import java.io.*;


public class SearchInventory {

//Pull up that main function jamie
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Product> inventory = getInventory();
        System.out.println("What's in stock: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product x = inventory.get(i);
            System.out.printf("\n ID: %d| Name: %s| Price: $%.2f".formatted(x.getId(), x.getName(), x.getPrice()));
        }
    }
    private static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1, "Uranium", 1.00F));
        inventory.add(new Product(2, "A really cool sword", 9.99F));
        inventory.add(new Product(3, "The love and respect of your father", 99999999999999999999999999999.99F));
        inventory.add(new Product(4, "Ed Gein's Guide to Interior Decoration", 18.99F));
        inventory.add(new Product(5, "Empanadas", 3.99F));
        return inventory;
    }

//Set up the product class, Jamie
}
    class Product {
        private int id =0; private String name = ""; private double price = 0.00;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

    }

