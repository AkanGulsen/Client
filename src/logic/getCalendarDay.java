package logic;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class getCalendarDay {
	static Calendar calendar = new GregorianCalendar();
	public static int currentMonth = calendar.get(Calendar.MONTH);
	public static int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
	public static int weekDay = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
	public static int year = calendar.get(Calendar.YEAR);
	public static int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	public static Calendar getCalendar() {
		return calendar;
	}
	
	public static int selectedDay = currentDay;
	
	public static int getSelectedDay(){
		return selectedDay;
	}
	
	public static void nextDay(int i){
		if(selectedDay < 31)
			selectedDay ++;
		else if(selectedDay == 31){
			selectedDay = 1;
			//måned  +1
		}
	}
	
	public static void preDay(int i){
		if(selectedDay < 1)
			selectedDay --;
		else if(selectedDay == 1){
			selectedDay = 31;
			//måned  -1
		}
	}
	
	
	

	public static void setCalendar(Calendar calendar) {
		getCalendarDay.calendar = calendar;
	}
	public static String getCurrentMonth() {
		int month = currentMonth;
		if (month == 0)
			return "January";
		else if (month == 1)
			return "February";
		else if (month == 2)
			return "March";
		else if (month == 3)
			return "April";
		else if (month == 4)
			return "May";
		else if (month == 5)
			return "June";
		else if (month == 6)
			return "July";
		else if (month == 7)
			return "August";
		else if (month == 8)
			return "September";
		else if (month == 9)
			return "October";
		else if (month == 10)
			return "November";
		else if (month == 11)
			return "December";
		else
			return "error";
				
		
	}
	public static void setCurrentMonth(int currentMonth) {
		getCalendarDay.currentMonth = currentMonth;
	}
	public static int getCurrentDay() {
//		return currentDay;
		return 1;
	}
	public static void setCurrentDay(int currentDay) {
		getCalendarDay.currentDay = currentDay;
	}
	public static int getWeekDay() {
		return weekDay;
	}
	public static void setWeekDay(int weekDay) {
		getCalendarDay.weekDay = weekDay;
	}
	public static int getYear() {
		return year;
	}
	public static void setYear(int year) {
		getCalendarDay.year = year;
	}
	public static int getDayOfWeek() {
		return dayOfWeek;
	}
	public static void setDayOfWeek(int dayOfWeek) {
		getCalendarDay.dayOfWeek = dayOfWeek;
	}
	
	public static boolean login (String username, String password){
		//Henter fra server
		return true;
	}
	

	
}