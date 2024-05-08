import java.util.Scanner;

public class TaskThree{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	double average = 0;	

	for(int i = 0; i < 10; i++){
	System.out.print("Enter Scores:");
	int scores = input.nextInt();
	sum = sum + scores;
	}
	System.out.println("Sum is = " + sum);
	average = (double)sum / 10;

	System.out.print("Average is = " + average);

}
}