package Condition;


class Test { 
public static void main(String args[]) {   

   float eng=80, phy=85, chem=45, math=67, comp=90;   
   double total, average, percentage;  
  

   total = eng + phy + chem + math + comp;   
  average = (total / 5.0);   
  percentage = (total / 500.0) * 100;   
  
   System.out.println("Total marks ="+total);     
System.out.println("Average marks = "+average);  

   System.out.println("Percentage = "+percentage); 
    } 
}