import java.util.Scanner;
public class TaskEight{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	int scores = 0;
	double average = 0;
	boolean validScore = (scores <= 100);
		
	
	for(boolean i = validScore; i < 10; i++){
	System.out.print("Enter Scores:");
	scores = input.nextInt();
	if(validScore == scores <= 100){
	sum = sum + scores;
	} 
	}
	System.out.print(sum);

}
}
