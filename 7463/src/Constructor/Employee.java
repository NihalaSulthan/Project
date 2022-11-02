package Constructor;
 class Employee {
	
	     int empid;  
	     String name;  
	     static String Office = "Mphasis";  
	     
	     Employee(int r, String n){  
	     empid = r;  
	     name = n;  
	     }  
	     void display(){
	    	 
	    	 System.out.println("Employee details:" +empid+" "+name+" "+Office);
	     }  
	
	    public static void main(String args[]){  
	    	
	    	Employee s1 = new Employee(13051,"Fathima");  
	    	Employee s2 = new Employee(13052,"Nihala");  
	    	Employee s3 = new Employee(333,"Sulthan");  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
 }