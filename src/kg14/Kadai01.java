package kg14;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Kadai01 {
    public static void main(String[] args) {
        Coffee[] cups = new Coffee[3];
        System.out.println("Total Vol: " + Coffee.getTotalVol());
        cups[0] = new Coffee(180);
        cups[1] = new Coffee(150);
        cups[2] = new Coffee(240);
        System.out.println("Total Vol: " + Coffee.getTotalVol());
    }
}
