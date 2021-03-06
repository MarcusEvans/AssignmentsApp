import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

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

        // Output the number of days between two dates.
        LocalDate firstDate = LocalDate.of(2018, Month.JANUARY, 1);
        LocalDate secondDate = LocalDate.of(2018, Month.MARCH, 5);
        long numberOfDays = daysBetween(firstDate, secondDate);
        System.out.println("The number of days between your specified dates are " + numberOfDays + "\n");

        // Given two dates, output the earlier..
        LocalDate firstValue = LocalDate.of(2018, Month.MARCH, 10);
        LocalDate secondValue = LocalDate.of(2018, Month.MARCH, 5);
        LocalDate whosFirst = whatCameFirst(firstValue, secondValue);
        System.out.println("The date that came first is: " + whosFirst + "\n");

        // Create a file with 100 random "month/day/year hour:minutes" (in that format) on each line.
        fileWriter();

        //Store data from the file into an ArrayList of LocalDateTime objects.
        List<String> fileReader = readFile("assignments.txt" );
        System.out.println(fileReader + "\n");

        // Output the number of stored dates in the year [Y].
//        int howManyOfThisYear = howManyOfThisYear(LocalDate.ofYearDay(2018,1), "assignments.txt");
//        System.out.println("The number of stored dates in a year are " + howManyOfThisYear);

        // Define and use a DayOfWeek enumerated type.
        EnumTest firstDay = new EnumTest(DayOfTheWeek.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(DayOfTheWeek.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(DayOfTheWeek.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(DayOfTheWeek.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(DayOfTheWeek.SUNDAY );
        seventhDay.tellItLikeItIs();


        // Define and use a Course enumerated type.

        EnumTest firstClass = new EnumTest(Courses.THEOLOGY);
        firstClass.Class();
        EnumTest nextClass = new EnumTest(Courses.DATASTRUCTURES);
        nextClass.Class();
        EnumTest otherClass = new EnumTest(Courses.FRENCH);
        otherClass.Class();
        EnumTest actingClass = new EnumTest(Courses.PERFORMANCELITERATURE);
        actingClass.Class();
        EnumTest mathClass = new EnumTest(Courses.STATS);
        mathClass.Class();

        // Define and use a Category enumerated type.
        EnumTest mostDisliked = new EnumTest(Category.FINAL_EXAM);
        mostDisliked.Category();
        EnumTest nextMostDisliked = new EnumTest(Category.HOMEWORK);
        nextMostDisliked.Category();
        EnumTest category = new EnumTest(Category.PRESENTATION);
        category.Category();
        EnumTest otherCategory = new EnumTest(Category.QUIZ);
        otherCategory.Category();
        EnumTest hatedCategory = new EnumTest(Category.TEST);
        hatedCategory.Category();






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

    private static LocalDate whatCameFirst(LocalDate firstValue, LocalDate secondValue) {
        if (firstValue.isBefore(secondValue)) {
            return firstValue;
        }
        return secondValue;
    }

    private static void fileWriter() {
        File outfile = new File("assignments.txt");
        try (PrintWriter pw = new PrintWriter(outfile)) {
            Random rand = new Random();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-mm-dd HH:MM");
            for (int i = 0; i < 100; i++) {
                LocalDateTime todaysDate = LocalDateTime.now();

                int randDate = rand.nextInt(30) + 1;
                LocalDateTime newDays = todaysDate.plusDays(randDate);
                LocalDateTime newTimes = todaysDate.plusHours(randDate).plusMinutes(randDate);

                String dateFormatter = newDays.format(formatter);
                String timeFormatter = newTimes.format(formatter);

                pw.println(dateFormatter);
                pw.println(timeFormatter);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static List<String> readFile(String filename) {
        List<String> records = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
            reader.close();
            return records;
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }

    private static int howManyOfThisYear(LocalDate year, String filename) {
        int count = 0;
        List<String> records = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
            reader.close();
            for (int i = 0; i < records.size(); i++) {
                if (records.equals(year)){
                    count ++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}













