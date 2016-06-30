package kg10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kota Nonaka on 2016/06/23.
 */
public class Kadai03 {
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

        Set<String> sum = new TreeSet<>();
        sum.addAll(setA);
        sum.addAll(setB);

        System.out.println("=== 集合Aと集合Bに含まれるすべての要素 ===");
        for (String val : sum){
            System.out.println(val);
        }
    }
}
