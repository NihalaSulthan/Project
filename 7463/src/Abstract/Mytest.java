package Abstract;

		abstract class Mytest {
			int a=5, b=6;
			abstract void calculate(int a, int b);
		
		}
		class Addition extends MyTest {
			void calculate(int a, int b) {
				int c=a+b;
				System.out.println("Add");
				
			}
		}
class Subtraction extends MyTest {
	void calculate(int a, int b) {
		int c=a-b;
		System.out.println("SUb");
	}
}
class Multiplication extends MyTest {
	void calculate(int a, int b) {
		int c=a*b;
		System.out.println("Mul");
	}
}

public static void main(String[] args) {
	
Mytest a= new Addition();
Mytest s = new Subtraction();
Mytest m = new Multiplication();
a.calculate();
m.calculate();
s.calculate();

}
