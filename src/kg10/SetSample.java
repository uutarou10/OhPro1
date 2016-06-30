package kg10;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kota Nonaka on 2016/06/21.
 */
public class SetSample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("grape");
        set.add("apple");
        set.add("orange");
        set.add("orange");

        for(String s : set){
            System.out.println(s);
        }
    }
}
