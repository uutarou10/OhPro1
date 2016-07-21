package kg14;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> values = new TreeSet<>();
        System.out.println("乱数を20回出力します");
        for (int i = 0; i < 20; i++) {
            int randomValue = rand.nextInt(20);
            values.add(randomValue);
            System.out.print(randomValue + ",");
        }
        System.out.println("");

        System.out.println("乱数は" + values.size() + "種類ありました");
        for (Integer i : values) {
            System.out.print(i + ",");
        }
    }
}
