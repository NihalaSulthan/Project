package List;

	import java.util.*;    
	class Treesete{    
	 public static void main(String args[]){    
		 TreeSet<String> set=new TreeSet<String>();  
         set.add("Karnataka");  
         set.add("Managalore");  
         set.add("Bangalore");  
         set.add("Mysore");  
         set.add("Udupi");  
         System.out.println("Set values: "+set);     
         System.out.println("Reverse Set: "+set.descendingSet());  
         
         System.out.println("Head Set: "+set.headSet("Bangalore", true));  
     
System.out.println("SubSet: "+set.subSet("Karnataka", false, "Mysore", true));  
           
         System.out.println("TailSet: "+set.tailSet("Bangalore"));  
   
	 }    
	}    