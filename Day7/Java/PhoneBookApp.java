import java.util.*;
import java.util.Scanner;
public class PhoneBookApp{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	ArrayList<String>firstNames = new ArrayList<String>();
	ArrayList<String>lastNames = new ArrayList<String>();
	ArrayList<String>phoneNumbers = new ArrayList<String>();
	ArrayList<String>emails = new ArrayList<String>();
	String nextOne = null;
	
	
	
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

case 1: do{
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

	System.out.print(firstNames
	break;

case 2: System.out.print("Enter the name to be removed:");
	String removeName = input.next();

	for(int count = 0; count < firstNames.size(); count++){
	if(removeName.equals(firstNames)){
	firstNames.remove(count);
	}
	System.out.print(firstNames + " ");

	}

	break;
case 3: System.out.print("Enter phone number:");
	String findPhoneNumber = input.next();

	for(int count = 0; count < phoneNumbers.size(); count++){
	if(findPhoneNumber.equals(phoneNumbers.get(count))){
	System.out.print(findPhoneNumber);
	}
	}
	System.out.print(phoneNumbers);
	
	



}




}

}