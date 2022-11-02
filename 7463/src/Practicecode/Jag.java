package Practicecode;

public class Jag {

	
		   public static void main(String[] args){
		      int[][] a = new int[2][];

		      a[0] = new int[3];
		      a[1] = new int[4];

		      int counter = 0; 
		      for(int row=0; row < a.length; row++){
		         for(int col=0; col < a[row].length; col++){
		            a[row][col] = counter++;
		         }
		      }
		      for(int row=0; row < a.length; row++){
		         System.out.println();
		         for(int col=0; col < a[row].length; col++){
		            System.out.print(a[row][col] + " ");
		         }
		      }
		   }
		}