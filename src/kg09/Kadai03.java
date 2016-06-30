package kg09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Kota Nonaka on 2016/06/16.
 */
public class Kadai03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Random rand = new Random();
        int zeroCount = 0;
        for(int i = 0; i < 10; i++){
            list.add(rand.nextInt(6));
        }

        for(Iterator ite = list.iterator(); ite.hasNext();){
            Integer output = (Integer)ite.next();
            System.out.print(output + ", ");

            if (output == 0){
                zeroCount++;
            }
        }
        System.out.print("\n");
        System.out.println("0 は " + zeroCount + " 個ありました");


    }
}
