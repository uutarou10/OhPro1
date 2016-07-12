package review;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Kadai01 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 5);
        Triangle t2 = new Triangle(3, 7);
        System.out.println("t1の面積 : " + t1.getArea());
        System.out.println("t2の面積 : " + t2.getArea());
        t1.enlarge(2);
        t2.enlarge(3);
        System.out.println("t1の底辺と高さを2倍にします");
        System.out.println("t2の底辺と高さを3倍にします");
        System.out.println("t1の面積 : " + t1.getArea());
        System.out.println("t2の面積 : " + t2.getArea());
    }
}
