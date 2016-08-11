import java.util.Scanner;

public class LeapYear{
	public static void main(String[]args){
		//Creating a new scanner recieve to recieve input from the user(usually i use input but i'm just trying out new stuff)
		Scanner recieve = new Scanner(System.in);
		System.out.println("Enter a year to check if it is a leap year");
		int year = recieve.nextInt();

		//Logic. This determines if the year is a leap year
		//Ordinarily year % 4 == 0 will work just, year % 400 == 0 will also work fine too, also year % 4 == 0 && year % 100 != 0 will work just fine alone.
		if ((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year +" is a leap year");
		}
		else {
			System.out.println(year +" is not a leap year");
		}
	}
}