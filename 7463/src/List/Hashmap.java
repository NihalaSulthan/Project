package List;

import java.util.HashMap;
import java.util.Map;

 
public class Hashmap {
	  
	   public static void main(String args[]) {  
	    HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Nihala");    
	      map.put(101,"Anjali");    
	      map.put(102,"Habeeba");  
	      map.put(103, "Chaitra");  
	    System.out.println("Initial list of elements: "+map);  
	    
	    map.remove(101);  
	    System.out.println("Updated list of elements: "+map);  
	   
	   }      
	}  

