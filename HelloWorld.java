
public class HelloWorld {
    public static void main(String[] args) {
        java.time.DayOfWeek today = java.time.LocalDate.now().getDayOfWeek();
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Hello World");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("I am sleeping");
                break;
        }
    }
}
