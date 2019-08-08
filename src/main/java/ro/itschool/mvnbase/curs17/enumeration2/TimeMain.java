package ro.itschool.mvnbase.curs17.enumeration2;

public class TimeMain {
    public static void main(String[] args) {
        System.out.println(Time.HOUR.toMinute(10));
        System.out.println(Time.MINUTE.toHour(120));
    }
}
