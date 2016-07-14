package kg13;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Kadai03 {
    public static void main(String[] args) {
        int intValue = 2048;
        double doubleValue = 8.3144598;

        System.out.println(String.format("%,d",intValue));
        System.out.println(String.format("% 8d",intValue));
        System.out.println(String.format("%,08d",intValue));

        System.out.println(String.format("%.4f",doubleValue));
        System.out.println(String.format("%010.2f",doubleValue));
    }
}
