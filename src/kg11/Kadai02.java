package kg11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kota Nonaka on 2016/06/30.
 */
public class Kadai02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Humburger",100);
        map.put("Cheeseburger",130);
        map.put("Teriyaki",310);
        map.put("Fishburger",310);
        map.put("French fries",250);

        System.out.println("Teriyaki : " + map.get("Teriyaki"));
        System.out.println("Cheeseburger : " + map.get("Cheeseburger"));

    }
}
