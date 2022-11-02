package Oops;
import java.util.Arrays;

public class Xyz

{
    public static void main(String[] args)
    {
        int[] a1 = new int [] {1, 2, 3, 4};
        int[] a2 = new int [] {1, 2, 4, 3};
        boolean result = Arrays.equals(a1, a2);

        if (result == true) {
           
            System.out.println("Two arrays are equal");
        }
        else {
            System.out.println("Two arrays are not equal");
        }
    }
}


   