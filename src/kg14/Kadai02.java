package kg14;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Kadai02 {
    public static void main(String[] args) {
        Box b = new Box(3,4);
        System.out.println(b);
        System.out.println(b.getDiagonal());

        b.changeSize(2,8);
        System.out.println(b);
        System.out.println(b.getDiagonal());
    }
}
