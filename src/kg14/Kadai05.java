package kg14;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Kadai05 {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("MILK",1);
        map.put("TOMATO",3);
        map.put("YOGURT",4);
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));

            //すべての要素のバリューを1減らす
            map.put(key,map.get(key)-1);
        }
        System.out.println("------");
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }



        }
}
