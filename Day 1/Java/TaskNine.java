import java.util.Scanner;
public class TaskNine{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	int score = 0;
	double average = 0;
	int validScore = 0;
		
	
	for(int i = 0; i < 10; i++){
	System.out.print("Enter Scores:");
	int scores = input.nextInt();
	if(scores <= 100 && score >= 0){
	sum = sum + scores;
	} 
	}
	System.out.print(sum);

}
}
