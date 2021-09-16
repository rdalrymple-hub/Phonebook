package phonebook;

import java.util.Scanner;

public class Phonebook {
	
	private static Person[] people; 
		
	public void addPerson(Person newPerson) {
		// create temporary array that is 1 larger than the current array
		Person[] temp = new Person[people.length + 1];
		// add the person in the original array to the temporary one
		for (int i = 0; i < people.length; i++) {
			temp[i] = people[i];
			
		}
		// add the new person to the end of the temp array
		temp[temp.length - 1] = newPerson;
		// reassign the original array to the new one
		people = temp;
	}
	
	//Search for an existing entry ???? Not sure what this means yet
	
	private Person[] searchPhonebookByFirstName(String FirstName) {
		Person[] matchingFirstNames = new Person[people.length];
		for (int i=0; i< people.length; i++) {
			if(people[i].getFName().equals(FirstName)) {
				matchingFirstNames[i] = people[i];
			}
		}
		return matchingFirstNames;
	}
	
	private Person[] searchPhonebookByLastName(String LastName) {
		Person[] matchingLastNames = new Person[people.length];
		for (int i=0; i< people.length; i++) {
			if(people[i].getLName().equals(LastName)) {
				matchingLastNames[i] = people[i];
			}
		}
		return matchingLastNames;
	}
	
	private Person[] searchPhonebookByFullName(String FullName) {
		Person[] matchingFullNames = new Person[people.length];
		for (int i=0; i< people.length; i++) {
			String fullName = people[i].getFName() + " " + 
		people[i].getMName() + " " + people[i].getLName();
			if(fullName.equals(FullName)) {
				matchingFullNames[i] = people[i];
			}
		}
		return matchingFullNames;
	}
	
	private Person searchPhonebookByTelephoneNumber(String pNumber) {
		for (int i=0; i< people.length; i++) {
			if(people[i].getPNumber().equals(pNumber)) {
				return people[i];
			}
		}
		return null;
	}
	
	private Person searchPhonebookByCity(String city) {
		Person[] newPhonebook = new Person[this.people.length];
		for (int i=0; i< people.length; i++) {
			if(people[i].getAddress().getCity().equals(city)) {
				return people[i];
			}
		}
		return null;
	}
	
	private Person searchPhonebookByState(String state) {
		Person[] newPhonebook = new Person[this.people.length];
		for (int i=0; i< people.length; i++) {
			if(people[i].getAddress().getState().equals(state)) {
				return people[i];
			}
		}
		return null;
	}
	
	private void deletePersonByTelephoneNumber(String pNumber) {
		Person[] newPhonebook = new Person[this.people.length];
		for (int i=0; i < people.length; i++) {
			if(!people[i].getPNumber().equals(pNumber)) {
				newPhonebook[i] = people[i];
			}
		}
		this.people = newPhonebook;
	}
	
	//Update Person By Telephone Number.. A separate menu to allow the user to pick what they want to update.
	
	private void showAllRecords() {
		for(int i = 0; i < people.length - 1; i++) {
	         for (int j = i+1; j< people.length; j++) {
	            if(people[i].getFName().compareTo(people[j].getFName())>0) {
	               Person temp = people[i];
	               people[i] = people[j];
	               people[j] = temp;
	            }
	         }
	      }
	}
	
	public static void main(String[] args) {
		boolean exit = false;
		Scanner input = new Scanner(System.in);
		
		people = new Person[9999];
		Phonebook book = new Phonebook();
		System.out.println("Welcome to the Phonebook Directory!");
		
		while (!exit) {
			
			System.out.println("Please make your selection by typing in the "
					+ "number corresponding to your selection: \n");
			
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
			System.out.println("11. Display all entries:");
			
			System.out.println("12. Exit the program");
			
			System.out.print("Make a selection: ");
			
			if (input.nextInt() == 1) {
				System.out.print("\nPlease enter phonebook entries in the following format: ");
				System.out.println("John E Doe, 114 Market St, St Louis, MO, 63333, 5555555555\n");
				input.nextLine(); //Flushing new line
				
				do {
					
					Person person = new Person();
	
					String[] entryValues = input.nextLine().split(",");
					
					String[] entryNameValue = entryValues[0].split(" ");
					
					person.setFName(entryNameValue[0]);
					if (entryNameValue.length > 2) { //means we have a middle name
						String middleName = "";
						for (int j = 1; j < entryNameValue.length - 1; j++) {
							middleName += entryNameValue[j] + " ";
						}
						person.setMName(middleName);
						person.setLName(entryNameValue[entryNameValue.length - 1]);
					}
					
					else {
						person.setLName(entryNameValue[1]);
					}
					
					Address address = new Address(entryValues[1], entryValues[2], entryValues[3], entryValues[4]);
					person.setpNumber(entryValues[5]);
					person.setAddress(address);
					
					book.addPerson(person);
					
					System.out.println(person.toString());

				} while (input.hasNextLine());
			}
			
			else if (input.nextInt() == 2) {
				//Search for an existing entry
			}
			
			else if (input.nextInt() == 3) {
				System.out.println("Enter first name: ");
				String firstName = input.nextLine();
				
				Person[] matchingFirstNames = book.searchPhonebookByFirstName(firstName);
				
				if (matchingFirstNames.length > 0) {
					System.out.println("Here are the entries matching the name you gave: \n");
					
					for (int i = 0; i < matchingFirstNames.length; i++) {
						System.out.println(matchingFirstNames[0].toString());
					}
				}
				else {
					System.out.println("There were no entries that matched the name you gave.\n");
				}
				
				//search people by first name
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
				System.out.println("Exiting the program...\n");
				input.close();
				System.exit(0);
			}
			
			else {
				System.out.println("No record found. "+ "Please try again.");
				continue;
			}
		}
	}
}	




