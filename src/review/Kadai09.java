package review;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai09 {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Java",220);
        map.put("C++",400);
        map.put("Ruby",30);
        map.put("Python",23);

        for (String key : map.keySet()){
            System.out.println("KEY: " + key + "\tVALUE: " + map.get(key));
        }
    }
}
