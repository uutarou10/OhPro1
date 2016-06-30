package kg11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kota Nonaka on 2016/06/28.
 */
public class MapSample01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("apple","red");
        map.put("lemon","yellow");
        map.put("banana","yellow");
        map.put("grape","violet");

//        String result = map.get("banana");
//        System.out.println("bananaに対応する値は" + result);

        System.out.println("entrySetバージョン");
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("\nkeySetバージョン");
        for (String key:map.keySet()){
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }
}
