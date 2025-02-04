package standart.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2000);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY,10);

        System.out.println(calendar.getTime());
    }
}
