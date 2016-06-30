package kg09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Kota Nonaka on 2016/06/16.
 */
public class Kadai04 {
    public static void main(String[] args) {
        String base = "Without haste, but without rest.";
        ArrayList list = new ArrayList();

        System.out.print("\n");
        System.out.println("=== 元の文字列 ===");
        System.out.println(base);

        for (String word : base.split(" ")){
            list.add(word.replaceAll("\\W",""));
        }

        System.out.print("\n");
        System.out.println("=== リストの要素 ===");
        for (Iterator ite = list.iterator(); ite.hasNext();){
            String output = (String)ite.next();
            System.out.println(output);

            //ここで要素の削除もやっちゃう。
            if (output.equalsIgnoreCase("without")){
                ite.remove();
            }
        }

        System.out.print("\n");
        System.out.println("=== リストの要素からWithoutを削除する ===");
        for (Iterator ite = list.iterator();ite.hasNext();){
            System.out.println(ite.next());
        }
    }
}
