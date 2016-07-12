package review;

import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai08 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++){
            Random rand = new Random();
            set.add(rand.nextInt(10));
        }

        System.out.println("発生した乱数は " + set.size() + "種類");
        for (int value : set){
            System.out.println(value);
        }
    }
}
