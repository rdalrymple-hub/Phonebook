package phonebook;

import java.util.Scanner;

public class Phonebook {
	
	private Person[] phonebook; 
		
	//Add New Entries
	
	//Search for an existing entry ???? Not sure what this means yet
	
	private Person[] searchPhonebookByFirstName(String FirstName) {
		Person[] matchingFirstNames = new Person[phonebook.length];
		for (int i=0; i< phonebook.length; i++) {
			if(phonebook[i].getFName().equals(FirstName)) {
				matchingFirstNames[i] = phonebook[i];
			}
		}
		return matchingFirstNames;
	}
	
	private Person[] searchPhonebookByLastName(String LastName) {
		Person[] matchingLastNames = new Person[phonebook.length];
		for (int i=0; i< phonebook.length; i++) {
			if(phonebook[i].getLName().equals(LastName)) {
				matchingLastNames[i] = phonebook[i];
			}
		}
		return matchingLastNames;
	}
	
	private Person[] searchPhonebookByFullName(String FullName) {
		Person[] matchingFullNames = new Person[phonebook.length];
		for (int i=0; i< phonebook.length; i++) {
			String fullName = phonebook[i].getFName() + " " + 
		phonebook[i].getMName() + " " + phonebook[i].getLName();
			if(fullName.equals(FullName)) {
				matchingFullNames[i] = phonebook[i];
			}
		}
		return matchingFullNames;
	}
	
	private Person searchPhonebookByTelephoneNumber(String pNumber) {
		for (int i=0; i< phonebook.length; i++) {
			if(phonebook[i].getPNumber().equals(pNumber)) {
				return phonebook[i];
			}
		}
		return null;
	}
	
	private Person searchPhonebookByCity(String city) {
		for (int i=0; i< phonebook.length; i++) {
			if(phonebook[i].getAddress().getCity().equals(city)) {
				return phonebook[i];
			}
		}
		return null;
	}
	
	private Person searchPhonebookByState(String state) {
		for (int i=0; i< phonebook.length; i++) {
			if(phonebook[i].getAddress().getState().equals(state)) {
				return phonebook[i];
			}
		}
		return null;
	}
	
	private void deletePersonByTelephoneNumber(String pNumber) {
		Person[] newPhonebook = new Person[this.phonebook.length];
		for (int i=0; i < phonebook.length; i++) {
			if(!phonebook[i].getPNumber().equals(pNumber)) {
				newPhonebook[i] = phonebook[i];
			}
		}
		this.phonebook = newPhonebook;
	}
	
	//Update Person By Telephone Number ???? Not sure what this means yet
	
	private void showAllRecords() {
		for(int i = 0; i < phonebook.length - 1; i++) {
	         for (int j = i+1; j< phonebook.length; j++) {
	            if(phonebook[i].getFName().compareTo(phonebook[j].getFName())>0) {
	               Person temp = phonebook[i];
	               phonebook[i] = phonebook[j];
	               phonebook[j] = temp;
	            }
	         }
	      }
	}
	
	public static void main(String[] args) {
		boolean exit = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Phonebook Directory!");
		
		while (!exit) {
			
			System.out.println("Please make your selection by typing in the "
					+ "number corresponding to your selection:");
			
			System.out.println("1. Add new entries");
			System.out.println("2. Search for an existing entry:");
			System.out.println("3. Search by First Name:");
			System.out.println("4. Search by Last Name:");
			System.out.println("5. Search by Full Name:");
			System.out.println("6. Search by Telephone number");
			System.out.println("7. Search by City");
			System.out.println("8. Search by State");
			System.out.println("9. Delete an entry by Telephone Number:");
			System.out.println("10 Update an entry by telephone number:");
			System.out.println("11. "
					+ "D"
					+ "isplay all entries:");
			
			
			
			
			System.out.println("12. Exit the program");
			
			System.out.print("Make a selection: ");
			
			if (input.nextInt() == 1) {
				//Add new entries
			}
			
			else if (input.nextInt() == 2) {
				//Search for an existing entry
			}
			
			else if (input.nextInt() == 3) {
				//search phonebook by first name
			}
			
			else if (input.nextInt() == 4) {
				//search phonebook by last name
			}
			
			else if (input.nextInt() == 5) {
				//search phonebook by full name
			}
			
			else if (input.nextInt() == 6) {
				//search phonebook by telephone number
			}
			
			else if (input.nextInt() == 7) {
				//search phonebook by city
			}
			
			else if (input.nextInt() == 8) {
				//search phonebook by state
			}
			
			else if (input.nextInt() == 9) {
				//delete record by telephone number
			}
			
			else if (input.nextInt() == 10) {
				//update record by telephone number
			}
			
			else if (input.nextInt() == 11) {
				//display all records
			}
			
			else if (input.nextInt() == 12) {
				System.exit(0);
			}
			
			else {
				System.out.println("No record found. "+ "Please try again.");
				continue;
			}
		}
		input.close();
	}
}	




