package Array;

public class Buffer {

 
public static void main(String[ ] args) 
{ 
 StringBuffer sb = new StringBuffer("Tech"); 
  int length = sb.length(); 
  int capacity = sb.length()+10 ;
  
  System.out.println("Length be: " + length); 
  System.out.println("Capacity be: "  +capacity); 
  } 
}