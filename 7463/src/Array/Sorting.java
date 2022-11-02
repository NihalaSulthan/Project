package Array;
import java.util.Arrays;

//Main class
public class Sorting {

 
 public static void main(String[] args)
 {
     
     int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

     
     Arrays.sort(arr);

     System.out.printf("Sorted numbers are : %s",Arrays.toString(arr));
 }
}