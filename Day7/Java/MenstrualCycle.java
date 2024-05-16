import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MenstrualCycle{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("============================================================");
	System.out.println("<<<<<<WELCOME TO ACCURATE MENTRUAL APP>>>>>>");
	System.out.println("============================================================");


	System.out.print("What is your name:");
	String name = input.next();

	System.out.print("What was the first day of last two month's cycle(01-01-1991):");
	String lastTwoMonthDate = input.next();
	
	System.out.print("What was the first day of last month's cycle(01-01-1991):");
	String lastMonthDate = input.next();

	System.out.print("How many days did the last period flow last:");
	int days = input.nextInt();
		System.out.println("============================================================");
	System.out.println("           *RESULT*   ");


	//LocalDate today = LocalDate.now();
	//System.out.println("Todays's date is " + today);
	
	//LocalDate oneMonth = today.plusMonths(1);
	//System.out.println("One Month from now is: " + oneMonth);

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate localLastTwoMonthDate = LocalDate.parse(lastTwoMonthDate, formatter);
	LocalDate localLastMonthDate = LocalDate.parse(lastMonthDate, formatter);

	Period monthsPeriod = Period.between(localLastTwoMonthDate, localLastMonthDate);
	long result = ChronoUnit.DAYS.between(localLastTwoMonthDate, localLastMonthDate);
	//System.out.println(monthsPeriod.getDays());
	System.out.println("Your length of Menstrual Cycle is " + result + "days");

	LocalDate nextCycleBegins = localLastMonthDate.plusDays(result);
	System.out.println("Date of next cycle is " + nextCycleBegins); 
	
	LocalDate flowEnds = nextCycleBegins.plusDays(days);

	System.out.println("Flow date is from " + nextCycleBegins + " to " + flowEnds);

	LocalDate ovulationPeriod = nextCycleBegins.minusDays(14);
	System.out.println("Ovulation date is :" + ovulationPeriod);

	LocalDate fertilePeriod = ovulationPeriod.minusDays(5);
	LocalDate fertilePeriodEnd = ovulationPeriod.plusDays(1);
	System.out.println("Fertile period is between " + fertilePeriod + " and " + fertilePeriodEnd);
	
	LocalDate safePeriod = ovulationPeriod.minusDays(6);
	LocalDate safePeriodEnd = ovulationPeriod.plusDays(2);
	//System.out.println("Safe period is between " + today + " and " + safePeriod + " and between " + fertilePeriodEnd);
	System.out.println("Every other day outside the fertile period is your safe period");

		System.out.println("============================================================");
	System.out.println("    THANK YOU FOR TRUSTING US   ");
	System.out.println("============================================================");


}
}
	