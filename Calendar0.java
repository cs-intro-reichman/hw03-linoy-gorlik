/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year); // checks for leap year first
		for(int i=1; i<=12; i++) { // runs the test 12 time (12 months)
			nDaysInMonthTest(i, year);
		}
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int month, int year) {
		int days = nDaysInMonth(month, year);
		System.out.println("Month "+ month + " has " + days + " days");
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){ // checks leap year according to known tests
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) { // returns the number of days in given month
		if(month >= 8){ // if month Aug or after
			if(month % 2 == 0){ // if even number then 31
				return 31;
			}
			else return 30;
		}
		else if (month == 2){ // checks for Feb according to leap year
			if ((isLeapYear(year)==true)) return 29;
			else return 28;
		}
		else {
			if(month % 2 == 0) return 30;
			else return 31;
		}
	}
}