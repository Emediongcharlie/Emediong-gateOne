import java.util.Scanner;
public class GradesAnalyzer{

public static void main(String [] args){


	Scanner input = new Scanner(System.in);

	System.out.print("How many students do you have?");
	int names = input.nextInt();

	System.out.print("how many subjects do you offer?");
	int numberOfSubjects = input.nextInt();

	//int rows = 3;
	//int column = 3;

	int scores [][] = new int[names][numberOfSubjects];

	//int [] scores = new int [numberOfSubjects];
	//int [] scores1 = new int [numberOfSubjects];
	//int [] scores2 = new int [numberOfSubjects];

	for(int i = 0; i < names; i++){
	
	
		for(int j = 0; j < numberOfSubjects; j++){
	System.out.println("Entering score for student  " + i);
	System.out.println("enter scores of subject  " + j);
	int score = input.nextInt();
	if(score <= 100){
	}
	else{
	continue; 
	}
	scores[i][j] = score;
	}
	}
	System.out.println();

	int sumRows = 0;
	int average = 0;
System.out.println("=============================================================");
	System.out.println("STUDENT"+"\t\t"+"SUB1"+"\t"+"SUB2"+"\t"+"SUB3"+"\t"+"TOT"+"\t"+"AVR"+"\t"+"POS");
System.out.println("=============================================================");
	for(int i = 0; i < names; i++){
	System.out.print("Student  " +   i + "\t ");
		for(int j = 0; j < numberOfSubjects; j++){
		sumRows = sumRows + scores[i][j]; 
		average = sumRows / numberOfSubjects;
	System.out.print(scores[i][j] + "\t");
	}
	System.out.print(sumRows + "\t");
	System.out.print(average);
	
	System.out.println();
	}
	System.out.println();
	System.out.println("==========================================================");
	System.out.println("==========================================================");
	System.out.println("SUBJECT SUMMARY");
	for(int i = 0; i < numberOfSubjects; i++){
		int sumColumn = 0;
		int max = 0;
		int columnAverage = 0;
		int passes = 0;
		int fails = 0;
		int passmark = 50;
		int min = scores[0][0];
		int number = 0;
		for(int j = 0; j < names; j++){
		sumColumn = sumColumn + scores[j][i];
	System.out.println("Subject " + i);
	if(scores[j][i] > max){
	max = scores[j][i];
	}
	columnAverage = sumColumn / names;
	if (scores[j][i] < passmark){
		fails++;
	}
	else{
		passes++;
	}
	if(min > scores[j][i]){
	min = scores[j][i];
	}
	}
	System.out.println("Total score is " + sumColumn + "\t");
	System.out.println("Highest scoring is student " + i + " scoring " + max);
	System.out.println("lowest scoring is student :" + names + " scoring " + min);
	System.out.println("Average score is " + columnAverage);
	System.out.println("Number of passes: " + passes);
	System.out.println("Number of failures: " + fails);
	System.out.println();
	}


	}
	}