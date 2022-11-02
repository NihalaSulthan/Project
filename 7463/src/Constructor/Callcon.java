package Constructor;

class Callcon {

		  int sum;
		  Callcon() {
		  
		    this(5, 2);
		  }
		
		  Callcon(int arg1, int arg2) {
		  
		    this.sum = arg1 + arg2;
		  }
		  void display() {
		    System.out.println("Sum is: " + sum);
		  }
		  public static void main(String[] args) {
			  Callcon obj = new Callcon();
		    obj.display();
		  }
		}