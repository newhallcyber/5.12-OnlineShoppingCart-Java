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
