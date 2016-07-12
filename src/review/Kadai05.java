package review;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai05 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("今日はyyyy年M月d日 H:m:s、1月1日からD日");
        System.out.println(sdf.format(now));
    }
}
