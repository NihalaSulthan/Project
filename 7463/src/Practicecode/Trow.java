package Practicecode;

public class Trow {
	  public static void calculate() throws ArithmeticException {
		        int num = 10 / 0;
		    }

		    public static void main(String[] args) {
		        try {
		            calculate();
		        } catch (ArithmeticException e) {
		            System.out.println("Arithmetic Exception thrown");
		        } 
		    }
}