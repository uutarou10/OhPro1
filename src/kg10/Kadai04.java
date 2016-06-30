package kg10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kota Nonaka on 2016/06/23.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();

        setA.add("Tokyo");
        setA.add("Kanagawa");
        setA.add("Saitama");

        Set<String> setB = new HashSet<>();

        setB.add("Tokyo");
        setB.add("Gunma");
        setB.add("Saitama");
        setB.add("Kyoto");

        Set<String> product = new TreeSet<>(setA);
        product.retainAll(setB);


        System.out.println("=== 集合Aと集合Bの共通要素 ===");
        for (String val : product){
            System.out.println(val);
        }
    }
}
