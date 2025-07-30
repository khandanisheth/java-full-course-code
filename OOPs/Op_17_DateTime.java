// Import the LocalDateTime and DateTimeFormatter class from java.time package.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeFormat {
  public static void main(String[] args) {
    LocalDateTime current_date_time = LocalDateTime.now();
    System.out.println("Default : " + current_date_time);
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String custome_date_time = current_date_time.format(format1);
    System.out.println("Format 1: " + custome_date_time);
    
    // Other formats.
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-YY HH:mm");
    custome_date_time = current_date_time.format(format2);
    System.out.println("Format 2: " + custome_date_time);
  }
}