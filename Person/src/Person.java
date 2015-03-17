/*Class person with fields name, address, phoneNumber, and emailAddress
 * made default constructor, setters, and getters
 * toString overrides to "Name is ..." 
 */

public class Person {
	private String name;
	private String address;
	private int phoneNumber;
	private String emailAddress;
	
	@Override
	public String toString() {
		return "Class Person; Name is " + this.getName();
	}

	public Person() {
	}
	
	public String getName() {
		return name;
	}
	
	public Person(String name, String address, int phoneNumber,
			String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
