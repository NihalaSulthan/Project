package Oops;

class Animal {

	  
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	
	class Dog extends Animal {

	
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

	class Main {
	  public static void main(String[] args) {

	 
	    Dog dc = new Dog();

	  
	    dc.name = "Niha";
	    dc.display();

	    dc.eat();

	  }
	}
