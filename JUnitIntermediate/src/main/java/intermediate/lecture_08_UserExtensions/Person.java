package intermediate.lecture_08_UserExtensions;

public class Person {

	private long id;
	private String firstName;
	private String lastName;
	
	public long getId() { return id; }
	public Person setId(long id) {
		this.id = id;
		return this;
	}
	public String getFirstName() { return firstName; }
	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getLastName() { return lastName; }
	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", id = " + id;
	}
}
