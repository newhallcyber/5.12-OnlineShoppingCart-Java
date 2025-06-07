# 5.12 Online Shopping Cart (Java)

This project is a simple Java program that simulates an online shopping cart.  
It was created as part of the **5.12 Online Shopping Cart** lab assignment.

## Project Files

- **ItemToPurchase.java**  
  Defines the `ItemToPurchase` class with the following fields and methods:
  - Fields: `itemName`, `itemPrice`, `itemQuantity`
  - Methods: `setName()`, `getName()`, `setPrice()`, `getPrice()`, `setQuantity()`, `getQuantity()`

- **ShoppingCartPrinter.java**  
  Contains the `main()` method that:
  - Prompts the user to input details for two items
  - Calculates and displays the total cost of the cart

## Lab Objectives

✅ Practice creating and using **Java classes**  
✅ Practice **encapsulation** with private fields and public methods  
✅ Practice handling **user input** with `Scanner`  
✅ Practice **basic arithmetic and output formatting**

## Example Output
Item 1
Enter the item name:
Chocolate Chips
Enter the item price:
3
Enter the item quantity:
1

Item 2
Enter the item name:
Bottled Water
Enter the item price:
1
Enter the item quantity:
10

TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13

ItemToPurchase:

public class ItemToPurchase {
   // Private fields
   private String itemName;
   private int itemPrice;
   private int itemQuantity;

   // Default constructor
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }

   // setName() & getName()
   public void setName(String newName) {
      itemName = newName;
   }

   public String getName() {
      return itemName;
   }

   // setPrice() & getPrice()
   public void setPrice(int newPrice) {
      itemPrice = newPrice;
   }

   public int getPrice() {
      return itemPrice;
   }

   // setQuantity() & getQuantity()
   public void setQuantity(int newQuantity) {
      itemQuantity = newQuantity;
   }

   public int getQuantity() {
      return itemQuantity;
   }
}

ShoppingCartPrinter:

//Import Java utility Scanner to obtain user input
import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      //Allows for user input via keyboard
      Scanner scnr = new Scanner(System.in);
      
      //Initializes the variables 
      String productName;
      int productPrice;
      int productQuantity;
      int cartTotal;
      int item1Price;
      int item2Price;
      
      //Creates new objects for item 1 and item 2
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      
      // Add blank line to match expected output
      System.out.println();
      
      //Set item 1 details 
      item1.setName(productName);
      item1.setPrice(productPrice);
      item1.setQuantity(productQuantity);
      
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      scnr.nextLine(); // Clear newline
      
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      
      // Add blank line to match expected output
      System.out.println();
      
      //Set item 2 details
      item2.setName(productName);
      item2.setPrice(productPrice);
      item2.setQuantity(productQuantity);
      
      // Add costs of two items and print total
      item1Price = (item1.getQuantity() * item1.getPrice());
      item2Price = (item2.getQuantity() * item2.getPrice());
      cartTotal = (item1Price + item2Price);
      
      // Total Cost
      System.out.println("TOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1Price);
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2Price);
      System.out.println();
      System.out.println("Total: $" + cartTotal);
   }
}
