import java.util.Random;
import java.util.Scanner;
public class ReceiveRandom{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	Random numbers = new Random();
	int num1 = 10;
	int num2 = 50;

	int range = num2 + num1;

	for(int i = 0; i < 10; i++){
	//System.out.print("r:")
	num1 = input.nextInt();
	
		int solve = Math.random(range);
		System.out.print(solve);
	}
}
}