package kg08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kota Nonaka on 2016/06/09.
 */
public class Kadai03 {
    public static void main(String[] args) {
        int month = 2;
        int day = 23;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日(E)");
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MONTH,month);
        cal.add(Calendar.DAY_OF_MONTH,day);
        System.out.println("今日は\n" + sdf.format(now) + "です\n" +
                "今日から" + month + "ヶ月と" + day + "日後は" + sdf.format(cal.getTime()) + "です");
    }
}
