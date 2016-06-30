package kg10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kota Nonaka on 2016/06/23.
 */
public class Kadai01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("red");
        list.add("green");
        list.add("blue");

        for(Iterator it = list.iterator(); it.hasNext();){
            String s = (String)it.next();
            System.out.println(s.toUpperCase());

        }
    }
}
