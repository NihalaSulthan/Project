package Array;

public class Threadisalive extends Thread {
    public void run()
    {

        System.out.println("HELLO ");
 
        try {
           
        	  Thread.sleep(300);  
        }
        catch (InterruptedException ie) {
        }
 
        System.out.println("World ");
    }
 
  
    public static void main(String[] args)
    {
    	Threadisalive c1 = new Threadisalive();
    	Threadisalive c2 = new Threadisalive();
 
        c1.start();
        
        c2.start();

        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
        
        
        
    }
}