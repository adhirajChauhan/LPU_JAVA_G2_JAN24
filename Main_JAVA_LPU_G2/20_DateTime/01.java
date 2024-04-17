import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;

class LPU{
    public static void main(String args[]){

        //LOCAL DATE

        // LocalDate ld = LocalDate.now();
        // LocalDate newDate = ld.plusDays(1);
        // LocalDate newDate = ld.minusDays(2);

        // LocalDate ld = LocalDate.of(2012, 04, 02);

        // System.out.println(ld.isLeapYear());

        // System.out.println(ld);


        //LOCAL TIME
        // System.out.println(LocalTime.now());

        //DATE TIME
        // System.out.println(LocalDateTime.now());


        //FORMATTING

        // LocalDateTime defaultDateTime = LocalDateTime.now();

        // System.out.println("Before Formatting : " + defaultDateTime);

        // DateTimeFormatter customFormatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy / E / W");

        // String formattedDate = defaultDateTime.format(customFormatDateTime);
        
        LocalDateTime ldt = LocalDateTime.of(2019, 11, 1, 4, 10, 30);

        // System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));

        ldt.plusDays(1);
        
        
    //    String new1 = ldt.format(DateTimeFormatter.ISO_LOCAL_DATE);
        // System.out.println("After FormaTTing : " + new1);


    }
}


//Print the current time of New York

