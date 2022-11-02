package Constructor;

public class Thiskeyex {

 int width, height, depth;
 Thiskeyex (int width, int height, int depth)
 {
                                                          
	  width = width;
  this.height = height;
  this.depth = depth;
 }
 
 void display () {
	 System.out.println("width = "+width);
	 System.out.println("height = "+height);
	 System.out.println("depth = "+depth);
 
}
 public static void main(String[] args) {
	 Thiskeyex s1 = new Thiskeyex(10,20,30);
	s1.display();
 }
}

