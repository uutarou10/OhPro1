package kg14;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Coffee {
    private int volume;
    private static int total;

    public Coffee(int volume) {
        this.volume = volume;
        total += volume;
    }

    public static int getTotalVol(){
        return total;
    }
}
