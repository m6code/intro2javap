public class ShowCurrentTime{
	public static void main(String[] args) {
		/*The System.currentTimeMillis() Returns the current time in milliseconds elapsed since midnight, 
		*January 1, 1970 GMT Which is when the UNIX epoch begin.
		*The epoch is the point when the unix operating system was formally formed.
		*/
		long milliSeconds = System.currentTimeMillis(); //gets the time in milliseconds
		long totalSeconds = milliSeconds/1000; //converts the milliseconds to seconds by dividing by 1000
		long currentSecond = totalSeconds % 60; //gets the reminder which is the current seconds
		long totalMinutes = totalSeconds / 60; //converts the seconds to minutes
		long currentMinute = totalMinutes % 60; //gets the reminder which is the current minute
		long totalHours = totalMinutes / 60; //converts the minutes to hours
		long currentHour = totalHours % 24 + 1; //get the reminder of the hours which is the current hour
		
		System.out.println("The Time is "+ currentHour + ":" + currentMinute + ":" + currentSecond + " GMT+1");
	}
}