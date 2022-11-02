package Simple;
class Animal{  
void eat(){
	System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
void bark(){
	System.out.println("Barking");
}  
}  
class Cat extends Animal{  
void meow(){
	System.out.println("Meowing");
	}  
}  
class Multi{  
public static void main(String args[]){  
Cat c=new Cat(); 
Dog d= new Dog();
d.eat();
d.bark();
c.meow();  
c.eat();  


}}  



