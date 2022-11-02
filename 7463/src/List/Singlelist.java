package List;

import java.util.LinkedList;

public class Singlelist {
	public static void main(String args[])
    {
  
        // Creating an empty LinkedList
        LinkedList <String>list = new LinkedList<String>();
        System.out.println("The Food list are:");
        list.add("Pizza");
        list.add("Burger");
        list.add("Coke");
        list.add("10");
        list.add("20");
          System.out.println("The First List is:" + list);
  
        list.add("Addons");
        list.add("Fries");
          System.out.println("The newly added List is:" + list);
    }
}