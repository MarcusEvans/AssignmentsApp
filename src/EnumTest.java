public class EnumTest {
    DayOfTheWeek day;

    public EnumTest(DayOfTheWeek day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(DayOfTheWeek.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(DayOfTheWeek.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(DayOfTheWeek.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(DayOfTheWeek.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(DayOfTheWeek.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
}
