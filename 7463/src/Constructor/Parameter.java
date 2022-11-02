package Constructor;

public class Parameter {
	  String name;
	    int id;
	 
	   
	    Parameter(String name, int id)
	    {
	       this.name = name;
	       this.id = id;
	    }
	
	    public static void main(String[] args)
	    {
	    	Parameter p1 = new Parameter("Nihala", 1);
	        System.out.println("Name :" + p1.name+" and Id :" + p1.id);
	    }
	}