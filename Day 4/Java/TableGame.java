import java.util.Arrays;
import java.util.Scanner;
public class TableGame{
public static void main(String[] args){

	char [] [] array = new char [3][3];
	Scanner input = new Scanner(System.in);
	int userInput = 0;

	int character = 0 ;
	for(int index = 0; index < array.length; index++){
		for(int count = 0; count < array.length; count++){
		System.out.print("Play at [" + index +"][" + count + "]:");
		array[index][count] = input.next().charAt(0);
		}
	}
	for(int index = 0; index < array.length; index++){
		for(int count = 0; count < array[index].length; count++){
		if(array[index][count] == 1){
			System.out.print("X");
		}
		
		if(array[index][count] == array[0][2]){
			System.out.print("O");
		}
		System.out.print(array[index][count] + " ");

		
	}
	System.out.println();
}

}
}


