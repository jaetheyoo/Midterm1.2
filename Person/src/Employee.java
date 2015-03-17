public class Employee extends Person {
	
	private String office;
	private double salary;
	private myDate date;

	@Override
	public String toString() {
		return "Class Employee; Name is " + super.getName();
	}
	
	public Employee() {
	}
	
	public Employee(String office, double salary, myDate date) {
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

	public myDate getDate() {
		return date;
	}

	public void setDate(myDate date) {
		this.date = date;
	}
}
