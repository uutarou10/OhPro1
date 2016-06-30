package kg08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kota Nonaka on 2016/06/09.
 */
public class Kadai01 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;

        System.out.println("Dateクラスのインスタンスを直接出力");
        System.out.println(date);
        System.out.println("");
        System.out.println("日付のみ");
        df = DateFormat.getDateInstance();
        System.out.println(df.format(date));
        System.out.println("");
        System.out.println("日付と時刻");
        df = DateFormat.getDateTimeInstance();
        System.out.println(df.format(date));
        System.out.println("");
        System.out.println("時刻のみ");
        df = DateFormat.getTimeInstance();
        System.out.println(df.format(date));
    }
}
