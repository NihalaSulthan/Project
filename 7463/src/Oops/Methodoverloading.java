package Oops;

class Overloading1 {
     public void disp(char c) {
    	 System.out.println(c);
     }
     public void disp(char c, int num) {
    	 System.out.println(c + ""+num);
     }
}

public class Methodoverloading {
	public static void main(String[] args) {
		Overloading1 obj= new Overloading1();
		// TODO Auto-generated method stub
		obj.disp('a');
        obj.disp('a',10);

	}

}
