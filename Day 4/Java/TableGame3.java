import java.util.Arrays;
import java.util.Scanner;
public class TableGame3{
public static void main(String[] args){

	int [] [] array = new int [3][3];
	Scanner input = new Scanner(System.in);
	int userInput = 0;

	int character = 0 ;
	for(int index = 0; index < array.length; index++){
		for(int count = 0; count < array.length; count++){
		System.out.print("Enter a number:");
		int number = input.nextInt();
		if(number == 1){
		//array[index][count] = array[0][0];
		}
		if(number == 2){
		array[index][count] = array[0][0];
		System.out.print("X");
		}

		}
	}
	for(int index = 0; index < array.length; index++){
		for(int count = 0; count < array[index].length; count++){
		
		System.out.print(array[index][count] + " ");

		
	}
	System.out.println();
}

}
}


