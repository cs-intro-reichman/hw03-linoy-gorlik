public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 2021;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sundayFunDay = 0; // counter for number of sundays that are the 1st of the month
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (true) {
		 	System.out.print(dayOfMonth+"/");
			System.out.print(month+"/");
			System.out.print(year);
			if(dayOfWeek == 1) System.out.print(" Sunday");
			System.out.println();

	 		advance();
	 		debugDaysCounter++;
	 		if (debugDaysCounter >= 365) { // checks end of loop by days passed
				// System.out.println("During the 20th century, " + sundayFunDay + " Sundays fell on the first day of the month");
	 			break;
	 		}
        }
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		dayOfWeek %= 7;
		dayOfWeek++;
		if(dayOfMonth < nDaysInMonth){ // checks if month hasn't ended
			dayOfMonth++;
		}
		else { // month ended
			dayOfMonth = 1;
			month++;
			nDaysInMonth = nDaysInMonth(month, year);
			if(dayOfWeek == 1){ // checks and adds sundays, 1st of the month
				sundayFunDay++;
			}
			// if(month == 13){ // checks if year has ended
			// 	month = 1;
			// 	year++;
			// 	nDaysInMonth = nDaysInMonth(month, year);
			// }
		}
	 }
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){ // checks according to calendar rules
			return true;
		}
		return false;
	}

	private static int nDaysInMonth(int month, int year) { // returns the number of days in given month
		if(month >= 8) { // if month Aug or after
			if(month % 2 == 0){ // if even number then 31
				return 31;
			}
			else return 30;
		}
		// else if (month == 2){ // checks for Feb according to leap year
		// 	if ((isLeapYear(year) == true)) return 29;
		// 	else return 28;
		// }
		else {
			if(month % 2 == 0) return 30;
			else return 31;
		}
	}
}


