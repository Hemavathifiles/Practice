package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        // Get current date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Get current time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Get current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);
    }
}
