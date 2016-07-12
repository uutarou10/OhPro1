package review;

import java.util.LinkedList;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai07 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Hino, Toyoda, Hachioji のリストを作成します");
        list.add("Hino");
        list.add("Toyoda");
        list.add("Hachioji");
        for (String str : list){
            System.out.println(str);
        }

        System.out.println("先頭に Tachikawa を挿入します");
        list.add(0,"Tachikawa");
        for (String str : list){
            System.out.println(str);
        }

        System.out.println("Hino, Toyoda を削除します");
        list.remove("Hino");
        list.remove("Toyoda");
        for (String str : list){
            System.out.println(str);
        }
    }
}
