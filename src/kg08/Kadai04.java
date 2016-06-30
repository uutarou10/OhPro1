package kg08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kota Nonaka on 2016/06/09.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Date from = new Date(0);
        Date to = new Date(2016-1900,5,9);
        DateFormat df = DateFormat.getDateInstance();

        System.out.println(df.format(from) + " から " + df.format(to) + " まで " + (to.getTime()-from.getTime()) + "ミリ秒");

        to = new Date(2017-1900,0,30);
        System.out.println(df.format(from) + " から " + df.format(to) + " まで " + (to.getTime()-from.getTime()) + "ミリ秒");

        from = new Date(2016-1900,5,9);
        to = new Date(2017-1900,0,30);
        int oneDay = 1000 * 60 * 60 * 24;
        System.out.println(
                df.format(from) + " から " + df.format(to) + " まで " + (to.getTime() - from.getTime()) / oneDay + "日"
        );
    }
}
