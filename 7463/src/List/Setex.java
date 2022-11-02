package List;
import java.util.*; 
public class Setex { 
	 public static void main(String[] args) {
		 HashSet<Integer> evenNumSet = new LinkedHashSet<>(
	                Arrays.asList(4,8,6,2,12,10,62,40,36) );
	 
	        System.out.println("Unsorted Set: " + evenNumSet); 
	        List<Integer> numList = new ArrayList<Integer>(evenNumSet);  
	           	        Collections.sort(numList);
	         
	        evenNumSet = new LinkedHashSet<>(numList); 
	       
	        System.out.println("Sorted Set:" + evenNumSet);
	        
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        set1.add(2);
	        set1.add(3);
	        System.out.println("Set1: " + set1);
	        
	        set2.add(10);
	        set2.add(20);
	        System.out.println("Set2: " + set2);

	        set2.addAll(set1);
	        System.out.println("Union is: " + set2);
	      
	    }
	}