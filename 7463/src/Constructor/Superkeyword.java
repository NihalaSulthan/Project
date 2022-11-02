package Constructor;

	class Person
	{
	    Person()
	    {
	    	
	        System.out.println("Person class Constructor");
	    }
	   Person(String  name)
	   {
	        System.out.println("Name of person:" +name);

	   }
	}
	  
	class Student extends Person
	{
	    Student()
	    {
	        super(name);
	  
	        System.out.println("Student class Constructor");
	    }
	}
	  
	class Superkeyword
	{
	    public static void main(String[] args)
	    {
	        Student s = new Student();
	    }
	} 