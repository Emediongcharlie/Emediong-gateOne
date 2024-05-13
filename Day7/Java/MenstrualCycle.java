import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MenstrualCycle{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("What is your name:");
	String name = input.next();

	System.out.print("What was the first day of last two month's cycle(1-1-1991):");
	String lastTwoMonthDate = input.next();
	
	//char charZero= lastTwoMonthDate.charAt(0);
	//int firstChar = Integer.parseInt(charZero);

	System.out.print("What was the first day of last month's cycle(1-1-1991):");
	String lastMonthDate = input.next();

	System.out.print("How many days did the last period last:");
	int days = input.nextInt();
	

	LocalDate today = LocalDate.now();
	System.out.println("Todays's date " + today);
	
	LocalDate oneMonth = today.plusMonths(1);
	System.out.println("One Month from now is: " + oneMonth);

	//LocalDate ovulationPeriod = secondDate.minusDays(14);
	//System.out.println("Ovulation date is :" + ovulationPeriod);

	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate localLastTwoMonthDate = LocalDate.parse(lastMonthDate, formatter);
	LocalDate localLastMonthDate = LocalDate.parse(lastMonthDate, formatter);

	Period monthsPeriod = Period.between(localLastTwoMonthDate, localLastMonthDate);
	System.out.println("Difference beween two previous period  " + monthsPeriod.getDays());
	
	
}
}
	