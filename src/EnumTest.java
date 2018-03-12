public class EnumTest {
    DayOfTheWeek day;
    Courses thisCourse;
    Category thisCategory;

    public EnumTest(DayOfTheWeek day) {
        this.day = day;
    }

    public EnumTest(Courses thisCourse) { this.thisCourse = thisCourse; }

    public EnumTest(Category thisCategory){this.thisCategory = thisCategory;}


    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
            case TUESDAY:
                System.out.println("Mondays & Tuesdays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best." + "\n");
                break;

            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public void Class() {
        switch (thisCourse) {
            case DATASTRUCTURES:
                System.out.println("DATASTRUCTURES is very challenging ");
                break;

            case THEOLOGY:
                System.out.println("THEOLOGY makes you think ");
                break;

            case STATS:
                System.out.println("STATS makes you very meticulous ");
                break;

            case FRENCH:
                System.out.println("FRENCH requires a lot of practice ");
                break;

            case PERFORMANCELITERATURE:
                System.out.println("PERFORMANCELITERATURE is very easy going ");
                break;

            default:
                System.out.println("Course ");
        }
    }
    public void Category() {
        switch (thisCategory) {
            case HOMEWORK:
                System.out.println("I HATE HOMEWORK!!! ");
                break;

            case QUIZ:
                System.out.println("I DISLIKE QUIZ ");
                break;

            case TEST:
                System.out.println("I AM AFRAID OF TEST ");
                break;

            case PRESENTATION:
                System.out.println("Presentations are cool ");
                break;

            case FINAL_EXAM:
                System.out.println("EXAMS STRESS ME OUT " + "\n");
                break;

            default:
                System.out.println("Category ");
        }
    }

}
