package Array;

public class TC {
	 public static void main(String[ ] args) {
		    try {
		      int[] a = {1, 2, 3};
		      System.out.println(a[10]);
		    } catch (Exception e) {
		      System.out.println("ArrayIndexOutOfBounds issue.");
		    }
		  }
		}