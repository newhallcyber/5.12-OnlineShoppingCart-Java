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


