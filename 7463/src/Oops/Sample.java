package Oops;


class Overloading2 {
     public void disp(char c) {
    	 System.out.println(c);
     }
     public void disp( int c) {
    	 System.out.println(c);
     }
}

public class Sample {
	public static void main(String[] args) {
		Overloading2 obj= new Overloading2();
		// TODO Auto-generated method stub
		obj.disp('a');
        obj.disp(10);

	}

}
