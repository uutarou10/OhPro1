package kg10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kota Nonaka on 2016/06/21.
 */
public class ListSample01 {
    public static void main(String[] args) {
        List data = new ArrayList();

        String str = "First String";
        Person psn = new Person("Taro",20);

        data.add(str);
        data.add(psn);

        String a = (String)data.get(0);
        System.out.println("0番目の要素:" + a);

        Person p = (Person)data.get(1);
        System.out.println("1番目の要素:" + p);
    }
}
