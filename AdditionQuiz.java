import java.util.Scanner;

public class AdditionQuiz{
	public static void main(String[]args){
		long n1 = System.currentTimeMillis() % 10;
		long n2 = System.currentTimeMillis() / 7 % 10;

		Scanner input = new Scanner(System.in);

		System.out.println("What is " + n1 + " + " + n2);

		int ans = input.nextInt();

		if (n1 + n2 == ans){
			System.out.println("You're correct");
		}

		else {
			System.out.println("You failed \nThe correct answer is "+ (n1+n2));
		}
	}
}