package kg10;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Kota Nonaka on 2016/06/23.
 */
public class Kadai05 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        String base = "To be, or not to be: that is the question.";
        String[] words = base.split(" ");

        for (String word : words){
            set.add(word.replaceAll("\\W","").toLowerCase());
        }

        System.out.print("元の文章: ");
        for (String word :words){
            System.out.print(word + " ");
        }
        System.out.print("\n");

        System.out.println("単語数　: " + set.size());

        System.out.print("単語一覧: ");
        for (String word : set){
            System.out.print(word + " ");
        }
        System.out.print("\n");

    }
}
