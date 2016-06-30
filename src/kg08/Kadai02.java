package kg08;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kota Nonaka on 2016/06/09.
 */
public class Kadai02 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日(E) a h:m:s.S z\n" +
                "1月1日から数えてD日目");
        System.out.println(sdf.format(now));

    }
}
