package kg09;

import java.util.ArrayList;

/**
 * Created by Kota Nonaka on 2016/06/16.
 */
public class Kadai01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("School");
        list.add("Computer");
        list.add("Science");

        System.out.println("=== リストに文字列を3つ追加します ===");
        System.out.println("要素数: " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");

        list.add(1,"of");

        System.out.println("=== リストの途中に文字列を1つ追加します ===");
        System.out.println("要素数: " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");
    }
}
