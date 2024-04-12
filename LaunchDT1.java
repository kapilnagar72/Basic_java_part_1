package DateTime;
import java.time.LocalDate;
public class LaunchDT1
{
   public static void main(String[]args)
   {
    
    LocalDate date =LocalDate.now();
    System.out.println(date);

    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();
    System.out.println(day+"/"+ month+"/"+ year);

    LocalDate time = LocalDate.now();
    System.out.println(time);
/*
    int hour = time.getHour();
    int min = time.getMinute();
    int sec = time.getSecond();
    int neno = time.getNeno();

    System.out.println(hour + ":" + min + ":" + sec + ":" + neno ":");

 */   
}
}