import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
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

        // Initialize a LocalDateTime object to your birthdate and the time 12:35 PM.
        LocalDate birthDated = LocalDate.of(1998, Month.JANUARY, 13);
        LocalDateTime howOldAmI = dateInitializer(birthDated);
        System.out.println("You are " + howOldAmI + " many days old\n");

        // Output the day of the week (Sunday-Saturday) that you were born.
        DayOfWeek dayOfWeek = whatDayOfTheWeek(birthDated);
        System.out.println("The day of the week you were born was: " + dayOfWeek + "\n");

        //Output the number of days you've been alive.
        long howManyDaysOld = ageCounter(birthDated);
        System.out.println("You are " + howManyDaysOld + " days old\n");

        //TODO Output the number of days between two dates.
        LocalDate firstDate = LocalDate.of(2018, Month.JANUARY, 1);
        LocalDate secondDate = LocalDate.of(2018, Month.MARCH, 5);
        long numberOfDays = daysBetween(firstDate, secondDate);
        System.out.println("The number of days between your specified dates are " + numberOfDays + "\n");


    }

    private static String todaysActualDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = currentTime.format(formatter);
        return formatDateTime;
    }


    private static String tomorrowsActualDate() {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime tommorowsDate = today.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = tommorowsDate.format(formatter);

        return formatDateTime;
    }

    private static LocalDate todaysDateAdder(int x) {
        LocalDate todaysDate = LocalDate.now();
        LocalDate dateAdder = todaysDate.plusWeeks(x);
        return dateAdder;

    }

    private static LocalDateTime dateInitializer(LocalDate birthDay) {
        LocalDate todaysDate = birthDay;
        LocalDateTime today = todaysDate.atTime(12, 35);


        return today;
    }

    private static DayOfWeek whatDayOfTheWeek(LocalDate birthDated) {
        DayOfWeek dayOfTheWeek = birthDated.getDayOfWeek();
        return dayOfTheWeek;
    }

    private static long ageCounter(LocalDate birthDay) {
        LocalDate todaysDate = LocalDate.now();

        long num1 = birthDay.toEpochDay();
        long num2 = todaysDate.toEpochDay();

        long daysOld = num2 - num1;
        return daysOld;
    }

    private static long daysBetween(LocalDate firstDate, LocalDate secondDate) {
        long dateOne = firstDate.toEpochDay();
        long dateTwo = secondDate.toEpochDay();

        long daysInBetween = dateTwo - dateOne;

        return daysInBetween;
    }
}

