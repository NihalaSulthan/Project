
package Oops;
class Overloading3 {
     public void disp(char c, int num) {
    	 System.out.println("First def of method");
     }
     public void disp( int num, char c) {
    	 System.out.println("Second def of method");
     }
}

public class Msample2 {
	public static void main(String[] args) {
		Overloading3 obj= new Overloading3();
		// TODO Auto-generated method stub
		obj.disp('a' ,45);
        obj.disp(10,'f');

	}

}
