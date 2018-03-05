import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nHello, AssignmentsApp!\n");

        LocalDate todaysDate = todaysActualDate();
        System.out.println("Todays Date is : " + todaysDate + "\n");

        


    }

    private static LocalDate todaysActualDate() {
        return LocalDate.now();
    }
}
