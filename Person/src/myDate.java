
public class myDate {
	int year;
	String month;
	int day;
	
	@Override
	public String toString() {
		return "Class MyDate: The " + day + " day of " + month + " in the year " + year;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
