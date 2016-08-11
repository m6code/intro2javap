public class TransformToJava28 {
	public static void main(String[]args){
		double miles = 100;
		double KILO_PER_MILE = 1.609;
		double kilometers;

		kilometers = miles * KILO_PER_MILE;

		System.out.println("The value for kilometers is " + kilometers);

		System.out.println("using Math.pow \n 6^3 is " + Math.pow(6,2) );

		System.out.println(56 % 6);
		System.out.println(78 % -4);
		System.out.println(-34 % 5) ;
		System.out.println(-34 % -5);
		System.out.println(5 % 1 );
		System.out.println(1 % 5);
	}
}