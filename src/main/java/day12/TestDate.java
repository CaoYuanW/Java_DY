package day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        // Sat Nov 19 22:20:48 CST 2022
        System.out.println(d1);
        Date d2 = new Date(1000);
        // Thu Jan 01 08:00:01 CST 1970
        System.out.println(d2);

        long time = d1.getTime();
        // 将日期对象转换为对应时间的毫秒值
        System.out.println(time);


        // SimpleDateFormat  日期转为为字符串
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s1 = sdf.format(d1);
        // 22-11-19 下午10:31
        System.out.println(s1);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s2 = sdf1.format(d1);
        // 2022年11月19日 22:32:52
        System.out.println(s2);

        // 字符串转为日期
        String s3 = "1970-11-11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date d3 = sdf2.parse(s3);
        System.out.println(s3);


    }
}
