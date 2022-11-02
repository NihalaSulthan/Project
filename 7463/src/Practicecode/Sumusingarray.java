package Practicecode;

public class Sumusingarray {
	public static void main(String [] args) {

	int a[][]= {
			{1,2,3},
			{5,5,6},
			{4,4,5}
			};
	for( int i=0;i<a[0].length;i++) {
		int total=0;
		for( int j=0;j<a.length;j++) {
			total+=a[i][j];
		}
	
			
	System.out.println("sum of row:" + i +  " is" +total );
	}
}

}