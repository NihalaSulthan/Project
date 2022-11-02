package Oops;

 class Override {
	public void info()
	{
		System.out.println("I am Student");
	}
}
class A extends Override{
	public void info()
	{
		System.out.println("I am Employee");
	}
}

public class Methodoveride {
	public static void main(String[] args) {
		A a = new A();
		a.info();

	}

}


