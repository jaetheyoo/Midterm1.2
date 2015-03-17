import java.util.Date;

public class Employee extends Person {
	
	private String office;
	private double salary;
	private Date date;

	@Override
	public String toString() {
		return "Class Employee; Name is " + super.getName();
	}
	
	public Employee() {
	}
	
	public Employee(String office, double salary, Date date) {
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
