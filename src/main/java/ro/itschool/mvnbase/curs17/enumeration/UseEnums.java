package ro.itschool.mvnbase.curs17.enumeration;

import static ro.itschool.mvnbase.curs17.enumeration.Days.FRIDAY;
import static ro.itschool.mvnbase.curs17.enumeration.Days.THURSDAY;

public class UseEnums {
    public static void main(String[] args) {
        DayName dayName = new DayName();
        System.out.println(dayName.sayMyName(FRIDAY));

        System.out.println(FRIDAY + " day in week is " + FRIDAY.getNumber());

        System.out.println(dayName.sayMyNumber(THURSDAY));
        System.out.println(dayName.sayMyName(FRIDAY));

        for (Days day : Days.values()) {
            System.out.println(day.getName());
        }

        System.out.println(Days.valueOf("MONDAY").getName());


        for (Days day : Days.values()) {
            if (day.bestDay()) {
                System.out.println(day.getName());
            }
        }
    }
}
