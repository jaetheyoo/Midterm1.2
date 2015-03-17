
public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	@Override
	public String toString() {
		return "Class Faculty; Name is " + this.getName();
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
