import java.util.*;
import java.util.Scanner;
public class CardValidator{
public static boolean number(String numbers){

	Scanner input = new Scanner(System.in);
	int count = 0;

		
	for(int i = 0; i < cardNumber.length(); i++){
		if(cardNumber.charAt(i) != '-'){
			count++;
	if(count == 16){
	return true;
	}
	if(cardNumber.startsWith("4")){
	return true;
	}
	if(cardNumber.startsWith("5")){
	return true;
	}
	if(cardNumber.startsWith("6")){
	return true;
	}
	}
	}
	return false;
}

}