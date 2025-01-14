package Enums;

public class WeekCheck {

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] a) {

        Day anDay = Day.FRIDAY;

        switch (anDay) {
            case MONDAY:
                System.out.println("it's weekday");
                break;
            case TUESDAY:
                System.out.println("it's weekday");
                break;
            case WEDNESDAY:
                System.out.println("it's weekday");
                break;
            case THURSDAY:
                System.out.println("it's weekday");
                break;
            case FRIDAY:
                System.out.println("it's weekday");
                break;

            default:
            System.out.println("it's weekend");
            break;
                
        }

    }

}
