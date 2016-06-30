package kg10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kota Nonaka on 2016/06/21.
 */
public class ListSample02 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();

        String str = "First String";
        Person psn = new Person("Taro",20);

        data.add(str);
        data.add(psn.toString());

        for (Iterator<String> ite = data.iterator(); ite.hasNext();){
            System.out.println(ite.next());
        }
    }
}
