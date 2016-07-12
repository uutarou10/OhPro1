package review;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai06 {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateTimeInstance();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,10);
        cal.add(Calendar.DATE,10);

        System.out.println(df.format(cal.getTime()));

    }
}
