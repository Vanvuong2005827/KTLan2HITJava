package model;

public class Person {
	protected String id;
	protected String fullName;
	protected int age;
	protected Address address;
	protected String birthday;
	
	//constructor's
	public Person() {
		
	}
	
	public Person(String id, String fullName, int age, Address address, String birthday) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.address = address;
		this.birthday = birthday;
	}

	//getter's
	public String getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public String getBirthday() {
		return birthday;
	}

	
	//setter's
	public void setId(String id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullName=" + fullName + ", age=" + age + ", address=" + address + ", birthday="
				+ birthday + "]";
	}
	
	
	
	
	
}
