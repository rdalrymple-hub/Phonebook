package phonebook;

public class Address {

	public Address() {}
	
	private String street;
	private String city;
	private String state;
	private String zip;

	public String getStreet() {return this.street;};

	
	public String setStreet(String street) {return this.street = street;};
		
	
	public String getCity() {return this.city;};
		
	
	public String setCity(String city){return this.city = city;};
		
	
	public String getState() {return this.state;};
	
	
	public String setSate(String state) {return this.state = state;};
		
	
	public String getZip() {return this.zip;};
	
	
	public String setZip(String zip){return this.zip = zip;};
		

	@Override
	public String toString() {
		return this.street + " ," + this.city + " ," + 
	this.state + " " + this.zip;
	}
}




