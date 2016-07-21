package kg14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Kadai03 {
    public static void main(String[] args) {
        List<String> langs = new ArrayList<>();
        langs.add("Java");
        langs.add("Python");
        langs.add("Ruby");
        System.out.println("リストの大きさ : " + langs.size());
        for (String lang : langs) {
            System.out.println(lang);
        }

        langs.add(1,"Go");
        langs.remove(3);
        langs.add(0,"Perl");
        System.out.println("リストの大きさ : " + langs.size());
        for (String lang : langs) {
            System.out.println(lang);
        }
    }
}
