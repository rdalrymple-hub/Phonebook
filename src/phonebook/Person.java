package phonebook;
import java.i.o.*;

public class Person {
		
	private String fName;
	private String mName;
	private String lName;
	private String pNumber;
	private Address address;
	
	public String getFName() {return this.fName;};
	

	public void setFName(String fName) {this.fName = fName;};
		
		
	public String getMName() {return this.mName;};
	
	
	public void setMName(String mName) {this.mName = mName;};
	
	
	public String getLName() {return lName;};
	

	public void setLName(String lName) {this.lName = lName;};
		
	
	public String getPNumber() {return this.pNumber;};
	
	
	public void setpNumber(String pNumber) {this.pNumber = pNumber;};
	
	
	public String pNumberToString() {return "(" + this.pNumber.
			substring(0, 3) + ")-" + this.pNumber.
				 substring(3, 6) + "-" + this.pNumber.substring(6);
	}
	
	public Address getAddress() {return this.address;};
	
	
	public void setAddress(Address address) {this.address = address;};
	

	@Override
	public String toString() {
		return this.fName + " " + this.mName + " " + this.lName + " " + " ," + 
				this.address.toString() + " ," + this.getPNumber();
	}	
}
