import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualCycle{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Whwt is your name:");
	String name = input.next();

	System.out.print("What was the first day of last two month's cycle(2024 - 12 - 1):");
	String lastTwoMonthDate = input.next();

	System.out.print("What was the first day of last month's cycle(2024 - 12 - 1):");
	String lastMonthDate = input.next();

	System.out.print("How many days did the last period last:");
	int days = input.nextInt();

	
	LocalDate today = LocalDate.now();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("1 - 12 - 2021");
	LocalDate date = LocalDate.parse(lastTwoMonthDate, formatter);
	LocalDate secondDate = LocalDate.parse(lastMonthDate, formatter);
}
}
	