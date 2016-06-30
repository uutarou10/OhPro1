package kg11;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kota Nonaka on 2016/06/30.
 */
public class Kadai05 {
    public static void main(String[] args) {
        String base = "An eye for an eye, a tooth for a tooth.";
        Map<String,Integer> words = new TreeMap<>();

        for (String w : base.split(" ")){
            String word = w.toLowerCase().replaceAll("\\W","");
            if (words.containsKey(word)){
                words.put(word,words.get(word)+1);
            }else {
                words.put(word, 1);
            }
        }

        int[] lengths = new int[words.size()];
        int count = 0;
        for (String key:words.keySet()){
            lengths[count] = key.length();
            count++;
        }
        Arrays.sort(lengths);
        int maxLength = lengths[lengths.length-1];

        System.out.println(base);
        for (String key : words.keySet()){
            System.out.println(myFormat(key,maxLength+2) + " : " + words.get(key));
        }
        for(String key: words.keySet()){
            System.out.println(key +"\t:"+words.get(key));
        }
    }

    //不適切な文字列揃えメソッド（笑）
    public static String myFormat(String s,int length){
        String result = s;
        for (int i = 0; i < length - s.length(); i++){
            result = result + " ";
        }
        return result;
    }
}