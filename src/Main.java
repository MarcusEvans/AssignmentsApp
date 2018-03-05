import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nHello, AssignmentsApp!\n");

        LocalDate todaysDate = todaysActualDate();
        System.out.println("Todays Date is : " + todaysDate + "\n");

        String tommorrowsDate = tomorrowsActualDate();
        System.out.println("Tomorrows Date is " + tommorrowsDate + "\n");

        


    }

    private static LocalDate todaysActualDate() {
        return LocalDate.now();
    }

    private static String tomorrowsActualDate(){
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime tommorowsDate = today.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = tommorowsDate.format(formatter);


        return formatDateTime;
    }
}

