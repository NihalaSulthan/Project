package Condition;
import java.util.Scanner;
class Age {
	 public static void main(String[] args) {
	int age;
				System.out.println("Please enter your age:");
				

				Scanner in = new Scanner(System.in);
				 age = in.nextInt();

				 if (age >=18 && age <= 60) {
					System.out.println("Adult");

				}
				 else if (age > 60) {
					System.out.println("Senior");

				} else {
					System.out.println("Minor");

				}

			}
}