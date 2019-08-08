package ro.itschool.mvnbase.curs17.enumeration;

public class DayName {
    public String sayMyName(Days day) {
        switch (day) {
            case MONDAY:
                return "Luni";
            case THURSDAY:
                return "Marti";
            case WEDNESDAY:
                return "Miercuri";
            case TUESDAY:
                return "Joi";
            case FRIDAY:
                return "Vineri";
            case SATURDAY:
                return "Sambata";
            case SUNDAY:
                return "Duminica";
            default:
                throw new IllegalArgumentException();
        }
    }

    public int sayMyNumber(Days day) {
        return day.getNumber();
    }
}
