import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nHello, AssignmentsApp!\n");

        //Output the current date-time
        String todaysDate = todaysActualDateTime();
        System.out.println("Todays Date is : " + todaysDate + "\n");

        //Output tomorrows date using a formatter
        String tommorrowsDate = tomorrowsActualDate();
        System.out.println("Tomorrows Date is " + tommorrowsDate + "\n");

        // Add 5 weeks to todays LocalDateTime
        LocalDate todaysDatePlus = todaysDateAdder(5);
        System.out.println("Todays date plus your specified number is " + todaysDatePlus + "\n");


    }

    private static String todaysActualDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = currentTime.format(formatter);
        return formatDateTime;
    }


    private static String tomorrowsActualDate(){
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime tommorowsDate = today.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = tommorowsDate.format(formatter);

        return formatDateTime;
    }

    private static LocalDate todaysDateAdder(int x){
        LocalDate todaysDate = LocalDate.now();
        LocalDate dateAdder = todaysDate.plusWeeks(x);
        return dateAdder;

    }
}

