package intro2javap;

import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[]args){
		//Generate 2 random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// 2. If number1 < number2, swap number1 with number2
		if (number1 < number2){
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		//2 prompt the user to enter the answer
		System.out.println("What is "+ number1 +"-" + number2);
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		// Grade the answer

		if (answer == number1 - number2){
			System.out.println("You're correct!");
		}

		else {
			System.out.println("You failed!. The correct answer is " + (number1 - number2) );
		}

	}
}