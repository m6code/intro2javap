
import java.util.Scanner;

public class TestBoleanOperations{
	public static void main(String[]args){
		//
		System.out.println("Enter a number to check");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		if (number % 2 == 0 && number % 3 == 0){
			System.out.println(number + " is divisible by both 2 and 3");
		}

		if (number % 2 == 0 || number % 3 == 0){
			System.out.println(number + " is divisible by 2 or 3");
		}

		if (number % 2 == 0 ^ number % 3 == 0){
			System.out.println(number + " is divisible by 2 or 3, but not both");
		}
	}
}