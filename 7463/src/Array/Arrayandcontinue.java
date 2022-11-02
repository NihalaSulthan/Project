package Array;
import java.util.Scanner;

public class Arrayandcontinue {
	
		public static void main(String[] args) {
			int total=0;
			Scanner input = new Scanner(System.in);

			for (int i = 0; i < 3; ++i) {
				System.out.print("Enter a number: ");
				int number = input.nextInt();

				if (number > 10) {
					continue;
				}

				total = total + number;
			}
			System.out.println("Total = " + total);
		}
	}