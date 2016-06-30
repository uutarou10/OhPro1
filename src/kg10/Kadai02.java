package kg10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Kota Nonaka on 2016/06/23.
 */
public class Kadai02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Tokyo");
        set.add("Kanagawa");
        set.add("Saitama");
        set.add("Kanagawa");
        set.add("Tokyo");


        for(Iterator it = set.iterator(); it.hasNext();){
            String s = (String)it.next();
            System.out.println(s);
        }
    }
}
