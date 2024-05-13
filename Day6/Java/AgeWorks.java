import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class AgeWorks{
public static void main(String[] args){


	LocalDate date = LocalDate.now();
	LocalDate dob = LocalDate.of(2019, 2, 3);
	DateTimeFormatter dateStyle = DateTimeFormatter.ofPattern("dd - MM - yyyy");
	String dobString = dob.format(dateStyle);
	String dateString = date.format(dateStyle);
	LocalDate localDob = LocalDate.parse(dobString, dateStyle);
	LocalDate localDate = LocalDate.parse(dateString, dateStyle);

	int age = AgeWorksFunctios.calculateAge(localDob, localDate);

	System.out.println(age + " years");
}
}
	
