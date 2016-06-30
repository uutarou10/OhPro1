package kg11;

import java.util.*;

/**
 * Created by Kota Nonaka on 2016/06/30.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("C0115995","C");
        map.put("C0115991","B");
        map.put("C0115997","X");
        map.put("C0115993","A");
        map.put("C0114991","B");

        map.remove("C0115997");
        map.replace("C0115993","S");
        map.put("C0115881","C");

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
    }
}
