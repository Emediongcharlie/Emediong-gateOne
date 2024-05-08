import java.util.Scanner;

public class TaskSix{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
	double average = 0;
		

	for(int i = 0; i < 10; i++){
	System.out.print("Enter Scores:");
	int scores = input.nextInt();
	if(scores % 2 == 0){
	sum = sum + scores;
	}
	}
	average = (double) sum / 10;
	System.out.print("average is = " + average);

}
}