package model;

public class Address {
	private String street;
	private String city;
	
	//constructor's
	public Address() {
		
	}
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	//getter's
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	
	//setter's
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
		
}
