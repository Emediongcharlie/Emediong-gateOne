import java.util.*;
import java.util.Scanner;
public class PhoneBookApp{

	static ArrayList<String>firstNames = new ArrayList<String>();
	static ArrayList<String>lastNames = new ArrayList<String>();
	static ArrayList<String>phoneNumbers = new ArrayList<String>();
	static ArrayList<String>emails = new ArrayList<String>();
	static Scanner input = new Scanner(System.in);

public static void main(String[] args){

	storeRecord();
	}
	
public static void storeRecord(){
	
System.out.println("""

1. Add contact
2. Remove contact
3. Find contact by phone number
4. Find contact by first name
5. Find contact by last name
6. Edit contact
""");

int user = input.nextInt();

switch(user){

case 1: addContact();
	break;
case 2: removeContact();
	break;
case 3: findContactByPhoneNumber();
	break;
case 4: findContactByFirstName();
	break;
case 5: findContactByLastName();
	break;
case 6: editContact();
	break;
}
}

public static void addContact(){

	String nextOne = null;

	do{
	System.out.print("Add contact");
	System.out.print("Enter your first name:");
	String firstName = input.next();
	firstNames.add(firstName);
	System.out.println("Enter your last name:");
	String lastName = input.next();
	lastNames.add(lastName);
	System.out.print("Enter your Phone number:");
	String phoneNumber = input.next();
	phoneNumbers.add(phoneNumber);
	System.out.print("Enter your email:");
	String email = input.next();
	emails.add(email);
	System.out.print("Do you want to add another contact?yes or No");
	nextOne = input.next();
	}	
	while(nextOne.equalsIgnoreCase("yes"));
	input.nextLine();

	for(int count = 0; count < firstNames.size(); count++){
	System.out.print(firstNames.get(count)  + " ");
	
	System.out.println(lastNames.get(count) + " ");

	System.out.println(phoneNumbers.get(count) + " ");

	System.out.println(emails.get(count) + " "); 
	
	}
	System.out.println("New contact saved successfully>>>>>>");
	
	System.out.println("press 1 to go back or 0 to continue");
	int whatNext = input.nextInt();
	if(whatNext == 1){
		storeRecord();
	}
	if(whatNext == 0){
		//break;
	}
	}

public static void removeContact(){

	System.out.print("Enter the name to be removed:");
	String removeName = input.next();

	for(int count = 0; count < firstNames.size(); count++){
	if(removeName.equals(firstNames.get(count))){
	firstNames.remove(count);
	lastNames.remove(count);
	phoneNumbers.remove(count);
	}

	}
	System.out.println(firstNames + " ");
	storeRecord();
	}


public static void findContactByPhoneNumber(){

 	System.out.print("Enter phone number:");
	String findPhoneNumber = input.next();

	for(int count = 0; count < phoneNumbers.size(); count++){
	if(findPhoneNumber.equals(phoneNumbers.get(count))){
	System.out.print(firstNames.get(count) + " ");
	System.out.println(lastNames.get(count));
	System.out.print(phoneNumbers.get(count));
	
	}
	}
	storeRecord();
	}
	
public static void findContactByFirstName(){

	System.out.print("Enter first name:");
	String findfirstName = input.next();
	
	for(int count = 0; count < firstNames.size(); count++){
	if(findfirstName.equals(firstNames.get(count))){
	System.out.print(firstNames.get(count) + " ");
	System.out.println(lastNames.get(count));
	System.out.print(phoneNumbers.get(count));
	}
	}
	storeRecord();
	}

public static void findContactByLastName(){

	System.out.print("Enter last name:");
	String findLastName = input.next();
	
	for(int count = 0; count < lastNames.size(); count++){
	if(findLastName.equals(lastNames.get(count))){
	System.out.print(firstNames.get(count) + " ");
	System.out.println(lastNames.get(count));
	System.out.print(phoneNumbers.get(count));
	}
	}
	storeRecord();
	}

public static void editContact(){
	
	System.out.print("Enter the phone number you want to edit");
	String editNumber = input.next();

	for(int count = 0; count < phoneNumbers.size(); count++){
	String editNumbers = phoneNumbers.set(count,editNumber); 
	if(editNumber.equals(phoneNumbers.set(count,editNumber))){
	System.out.print(phoneNumbers.set(count,editNumber);
	System.out.print(firstNames.set(count,editNumber));
	}
	}
	storeRecord();
	}

}