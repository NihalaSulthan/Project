package ShoppingCartPrinter;
public class Itemtopurchase {
	
	   public String itemName;
	   public int itemPrice;
	   public int itemQuantity;

	   public Itemtopurchase()
	   {
	      itemName="none";
	      itemPrice=0;
	      itemQuantity=0;  
	   }

	   public void setName(String name)
	   {
	      itemName = name;   
	   }
	   public String getName()
	   {
	      return itemName;
	   }

	    }