package DAT;
// import the LocalDate class forom java.time package.
import java.time.*;

public class DateTime {
  public static void main(String[] args) {
    LocalDate current_date = LocalDate.now();
    System.out.println("Current date : "+ current_date);

    LocalTime current_time = LocalTime.now();
    System.out.println("Current time : "+ current_time);


    LocalDateTime current_date_time = LocalDateTime.now();
    System.out.println("Current date time : "+ current_date_time);
  }
}