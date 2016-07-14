package kg13;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Kadai04 {
    public static void main(String[] args) {
        String url = "http://www.teu.ac.jp/gakubu/cs/006333.html";

        System.out.println(url.replaceAll("[0-9]","*"));
        System.out.println(url.replaceAll("\\.","*"));
        System.out.println(url.replaceAll("[abc]","*"));
        System.out.println(url.replaceAll("^h","*"));
        System.out.println(url.replaceAll("\\w+","*"));
    }
}
