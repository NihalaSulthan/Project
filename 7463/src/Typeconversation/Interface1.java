package Typeconversation;


interface Square {
	  void getArea(int length, int breadth);
	}
	class Rectangle implements Square {

	  public void getArea(int length, int breadth) {
		  int sum=length*breadth;
	    System.out.println("The area of the rectangle is " +sum);
	  }
	}

	class Interface1 {
	  public static void main(String[] args) {
	    Rectangle r1 = new Rectangle();
	    r1.getArea(5, 6);
	  }
	}