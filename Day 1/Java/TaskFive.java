import java.util.Scanner;

public class TaskFive{

public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	int sum = 0;
		

	for(int i = 0; i < 10; i++){
	System.out.print("Enter Scores:");
	int scores = input.nextInt();
	if(scores % 2 == 0){
	sum = sum + scores;
	}
	}

	System.out.print("sum is = " + sum);

}
}