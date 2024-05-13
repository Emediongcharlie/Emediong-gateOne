import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MenstrualCycle{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("What is your name:");
	String name = input.next();

	System.out.print("What was the first day of last two month's cycle(2024 - 12 - 1):");
	String lastTwoMonthDate = input.next();

	System.out.print("What was the first day of last month's cycle(2024 - 12 - 1):");
	String lastMonthDate = input.next();

	System.out.print("How many days did the last period last:");
	int days = input.nextInt();
	
	LocalDate today = LocalDate.now();
	System.out.print("Todays's date " + today);
	
	//int date = Integer.parseInt(lastMonthDate);

	//LocalDate dates = LocalDate.of(date);
	
	LocalDate oneMonth = today.plusMonths(1);
	System.out.print("One Month from now is: " + oneMonth);

	LocalDate date = LocalDate.parse(lastTwoMonthDate);
	LocalDate secondDate = LocalDate.parse(lastMonthDate);

	LocalDate ovulationPeriod = secondDate.minusDays(14);
	System.out.print("Ovulation date is :" + ovulationPeriod);
	
}
}
	