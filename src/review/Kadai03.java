package review;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String input = "2016/07/12 10:47:51 c0115999ab Kadai01.java ok.";

        System.out.println(input.replaceAll("[0-9]","+"));
        System.out.println(input.replaceAll("[^0-9]","@"));
        System.out.println(input.replaceAll("[a-zA-Z]+","#"));
        System.out.println(input.replaceAll("\\W","="));
        System.out.println(input.replaceAll("\\.$","?"));
    }
}
