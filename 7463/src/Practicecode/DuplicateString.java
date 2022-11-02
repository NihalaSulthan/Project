package Practicecode;

public class DuplicateString {
	     public static void main(String[] args) {  
	    	 Duplicatecharswithcount("Java is a programming lanagugae which i am currently learning");
	     }
	       
	     private static void Duplicatecharswithcount(String str) {
		        System.out.println("Duplicate  string: " + str);  

	        
	        for(int i = 0; i <str.length(); i++) {  
	           int count = 1;  
	           //one char at a times
	            char  c = str.charAt(i);
	            // this line used for dont count spaces
	            if (c == ' ')
	            	continue;
	            
	            for(int j = i+1; j <str.length(); j++) {  
	                if(c == str.charAt(j)) {  
	                    count++;
	                    //remove char so that not iterated again in next iteration
	                    str = str.substring(0,j) + str.substring(j+1);
	                }  
	            }  
	            if(count > 1)  
	                System.out.println(c + " found " + count + " times");  
	        }  
	    }  
	}  
