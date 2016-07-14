package kg13;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Kadai05 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance();
        cal.clear();
        cal.set(2016,0,1);

        cal.add(Calendar.MONTH,-3);
        cal.add(Calendar.DATE,-10);

        System.out.println(df.format(cal.getTime()));
    }
}
