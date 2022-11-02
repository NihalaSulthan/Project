package List;
import java.util.*; //importing the stack class
class Stackex{
  public static void main (String[] args) 
  { 
	  Stack<Integer> even = new Stack<>();
    even.push(0);
    even.push(2);
    even.push(4);
     even.push(5);
    even.push(8);
    even.push(10);
    even.push(12);
    even.push(14);
    even.push(16);
System.out.println("Print Stack before pop:" + even);

    System.out.println("Delete = " + even.pop());
    System.out.println("Delete = " + even.pop());
    System.out.println("Delete = " + even.pop());
    
    System.out.println("Print Stack after DELETE:" +even);
    System.out.println("Number on top of the stack is => " + even.peek());
    System.out.println("Position of 8 from the top is " + even.search(8));
 
  }
}