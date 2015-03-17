public class Student extends Person {
	private eStatus status;
	
	@Override
	public String toString() {
		return "Class Student; Name is " + super.getName();
	}
	
	public Student() {
	}
	
	public Student(int Status) {
		this.status = eStatus.values()[Status];
	}

	public eStatus getStatus() {
		return status;
	}
}