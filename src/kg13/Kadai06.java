package kg13;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Kadai06 {
    public static void main(String[] args) {
        ArrayList<String> studentIds = new ArrayList<>();

        for (int i = 1; i <= 400 ; i++){
            studentIds.add("C0115" + String.format("%03d",i));
        }

        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            System.out.println(studentIds.get(rand.nextInt(studentIds.size())));
        }

//        LinkedHashSet<String> output = new LinkedHashSet<>();
//        Random rand = new Random();
//        while (output.size() < 20) {
//            output.add(studentIds.get(rand.nextInt(studentIds.size())));
//        }
//
//        for (String str : output) {
//            System.out.println(str);
//        }
    }
}
