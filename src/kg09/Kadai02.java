package kg09;

import java.util.ArrayList;

/**
 * Created by Kota Nonaka on 2016/06/16.
 */
public class Kadai02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Ruby");
        list.add("Python");

        System.out.println("=== リストの要素一覧 ===");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n\n");

        System.out.println("=== リストに含まれるか ===");
        if(!list.contains("Go")){
            System.out.println("要素Goはリストに含まれていません。");
        }
        System.out.print("\n");

        list.set(list.indexOf("Ruby"),"Go");

        System.out.println("=== リストの要素の変更 ===");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");

    }
}
