package kg13;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Kadai02 {
    public static void main(String[] args) {
        String input = "School of Computer Science";

        System.out.println(input.length());
        System.out.println(input.substring(12,15));
        System.out.println(input.indexOf("e",24));
        System.out.println(input.contains("put"));

        String[] ary = input.split("o");
        System.out.print(ary.length + " ");
        for (String str : ary){
            System.out.print(str + ", ");
        }
    }
}
