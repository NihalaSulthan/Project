package Practicecode;
import java.util.Scanner;
public class Hash {
 public static void main( String [] args) {
	 Scanner sc = new Scanner(System.in);
	 int sum=0,
	 count=0;
	 System.out.println("enter the no and any character other than a integer");
	 while(sc.hasNext())
	 {
		 int num=sc.nextInt();
		 sum+=num;
		 count++;
		 
	 }
	 int mean =sum/count;
	 System.out.println("Mean of the no:" + mean);

 }
}
