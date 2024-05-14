import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MenstrualCycle{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("What is your name:");
	String name = input.next();

	System.out.print("What was the first day of last two month's cycle(01-01-1991):");
	String lastTwoMonthDate = input.next();
	
	//char charZero= lastTwoMonthDate.charAt(0);
	//int firstChar = Integer.parseInt(charZero);

	System.out.print("What was the first day of last month's cycle(01-01-1991):");
	String lastMonthDate = input.next();

	System.out.print("How many days did the last period last:");
	int days = input.nextInt();
	

	LocalDate today = LocalDate.now();
	System.out.println("Todays's date is " + today);
	
	LocalDate oneMonth = today.plusMonths(1);
	System.out.println("One Month from now is: " + oneMonth);

	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate localLastTwoMonthDate = LocalDate.parse(lastTwoMonthDate, formatter);
	LocalDate localLastMonthDate = LocalDate.parse(lastMonthDate, formatter);

	LocalDate ovulationPeriod = localLastMonthDate.minusDays(14);
	System.out.println("Ovulation date is :" + ovulationPeriod);

	Period monthsPeriod = Period.between(localLastTwoMonthDate, localLastMonthDate);
	long result = ChronoUnit.DAYS.between(localLastTwoMonthDate, localLastMonthDate);
	//System.out.println(monthsPeriod.getDays());
	System.out.println("Your length of Menstrual Cycle is " + result + "days");
	
	
	LocalDate fertilePeriod = ovulationPeriod.minusDays(5);
	LocalDate fertilePeriodEnd = ovulationPeriod.plusDays(1);
	System.out.println("Fertile period is between " + fertilePeriod + " and " + fertilePeriodEnd);
	
	
	LocalDate safePeriod = ovulationPeriod.minusDays(6);
	LocalDate safePeriodEnd = ovulationPeriod.plusDays(2);
	//System.out.println("Safe period is between " + today + " and " + safePeriod + " and between " + fertilePeriodEnd);
	System.out.println("Every other day outside the fertile period is safe");

	LocalDate nextCycleBegins = localLastMonthDate.plusDays(result);
	System.out.println("Date of next cycle is " + nextCycleBegins); 
	
}
}
	