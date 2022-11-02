package Practicecode;

public class Reverseno {
	 public static void main(String[] args) {
		    
		    int i , number = 1234567, reverse = 0;

		    for(i=1; i<=number; i++) {
		    	int remainder = number % 10;  
		    	reverse = reverse * 10 + remainder;  
		    	number = number/10;

		    }

		    System.out.println("Reversed Number: " + reverse);
		  }
		}                                                    