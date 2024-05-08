import java.util.Scanner;

public class TaskOne{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int sum = 0;	

	for(int i = 0; i < 10; i++){
	System.out.print("Enter Scores:");
	int scores = input.nextInt();
	sum = sum + scores;
	}
	System.out.print("Sum is = " + sum);

}
}