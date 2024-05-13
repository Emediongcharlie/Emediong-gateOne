import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class AgeWorksFunctios{
public static int calculateAge(LocalDate localDob, LocalDate localDate){

Period period = Period.between(localDob, localDate);
return period.getYears();
}
}