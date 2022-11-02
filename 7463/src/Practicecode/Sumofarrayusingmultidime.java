package Practicecode;

public class Sumofarrayusingmultidime {
	public static void main(String [] args) {
		int sum=0;
		int a[][]= {
				{1,2,3},
				{5,5,6},
				{4,4,5}
				};
		for( int i=0;i<a.length;i++) {
			for( int j=0;j<a.length;j++) {
				sum+=a[i][j];
			}
		}
				
		System.out.println("sum ofarray:" +sum );
		}
}
	
