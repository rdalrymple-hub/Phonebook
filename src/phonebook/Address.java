package phonebook;

public class Address {

	public Address() {}
	
	public Address(String street, String city, String state, String zip) {
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
	}
	
	private String street;
	private String city;
	private String state;
	private String zip;

	public String getStreet() {return street;};

	
	public String setStreet(String street) {return this.street = street;};
		
	
	public String getCity() {return city;};
		
	
	public String setCity(String city){return this.city = city;};
		
	
	public String getState() {return state;};
	
	
	public String setState(String state) {return this.state = state;};
		
	
	public String getZip() {return zip;};
	
	
	public String setZip(String zip){return this.zip = zip;};
		

	@Override
	public String toString() {
		return this.street + "," + this.city + "," + 
	this.state + "," + this.zip;
	}
}




