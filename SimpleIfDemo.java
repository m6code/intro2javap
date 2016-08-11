import java.util.Scanner;

public class SimpleIfDemo{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter An Integer");
		int number = input.nextInt();

		if (number % 5 == 0){
			System.out.println("HiFive");//that's number is a multiple of five (5)
		}

		if (number % 2 == 0){
			System.out.println("HiEven");//That's the number is divisible by
		}


		//ANother One
		int x = 0;
		System.out.println("Enter a value for y");
		int y = input.nextInt();

		if (y > 0){
			x = 1;
		}

		System.out.println("y is " + y + " , x is " + x);
	}
}