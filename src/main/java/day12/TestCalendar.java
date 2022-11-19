package day12;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        cal.add(Calendar.YEAR,-1);

        cal.set(Calendar.YEAR,2011);

        // 将日历转换为日期
        Date d1 = cal.getTime();
        System.out.println(d1);
    }
}
