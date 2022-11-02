package Practicecode;

public class Swap2 {
	public static void main(String []args)
    {
		int a=60, b=54;
		System.out.println("************Before swapping*****************");
		System.out.println("First number"+ " "+a);
		System.out.println("First number"+ " " +b);
		
		
	/*	a=a+b;
		b=a-b;
		a=a-b;
		*/
		
	     	a=a*b;   // addition of 2 given number;
			b=a/b; //total-second number =fist number
			a=a/b; //first number equal to total minus second
			
		
		
		System.out.println("*************After swapping*****************");
		System.out.println("First number"+ " "+a);
		System.out.println("First number"+ " " +b);
		
    }
	
}
