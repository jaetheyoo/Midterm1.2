
public class Staff extends Employee{
	private String title;
	
	@Override
	public String toString() {
		return "Class Staff; Name is " + this.getName();
	}
	
	public Staff() {
		}
	
	public Staff(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
