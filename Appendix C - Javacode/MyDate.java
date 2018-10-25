import java.io.Serializable;
import java.util.GregorianCalendar;

public class MyDate implements Serializable
{

	private int day;
	private int month;
	private int year;

	public MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	
	public MyDate() {
		GregorianCalendar currentDate = new GregorianCalendar();
		int currentDay = currentDate.get(GregorianCalendar.DATE);
		int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
		int currentYear = currentDate.get(GregorianCalendar.YEAR);
		day = currentDay;
		month = currentMonth;
		year = currentYear;
	}

	
	public int daysInMonth() {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if (month == 2) {
			if (isLeapYear()) {
				return 29;
			} else {
				return 28;
			}
		}
		return -1;
	}
	
	public int DaysTo(MyDate date2)
	{
		int days=0;
		MyDate one=new MyDate(day,month,year);
		do
		{
			days++;
			nextDay();
		}while(isBefore(date2));
		day=one.day;
		month=one.month;
		year=one.year;
		return days;
	}
	
	public void nextDay() {

		day++;

		if (day > daysInMonth()) {
			day = 1;
			month++;

			if (month > 12) {
				month = 1;
				year++;
			}
		}

	}
	
	public String getMonthName() {

		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "error";
		}

	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return day + "/" + getMonthName() + "/" + year;
	}
	
	public boolean isLeapYear() {
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		else if (year % 400 == 0)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyDate obj) 
	{
		if (!(obj instanceof MyDate)) 
		{
			return false;
		}
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public boolean isBefore(MyDate date2) {
		if(year<date2.year)
			return true;
		else if(year==date2.year)
		{
			if(month<date2.month)
				return true;
			else if(month==date2.month)
				if(day<date2.day)
					return true;
		}
		return false;
				
	}
	public boolean isBetween(MyDate date1, MyDate date3)
	{
		MyDate date2=new MyDate(day,month,year);
		return date1.isBefore(date2)&&date2.isBefore(date3);
		
	}
	public boolean existingDate()
	{
		return month>0&&month<13&&day>0&&day<=daysInMonth();
	}
}
