package Constructor;

public class Default {
	  int n;
	    String name;
	
	    Default()
	    { 
	    	System.out.println("Constructor called");
	    	}

	    public static void main(String[] args)
	    {                                                    
	        
	    	Default c1 = new Default();
	 
	        
	        System.out.println(c1.name);
	        System.out.println(c1.n);
	    }
}