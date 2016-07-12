package review;

/**
 * Created by Kota Nonaka on 2016/07/12.
 */
public class Triangle {
    private int base;
    private int height;

    public Triangle(int b, int h){
        this.base = b;
        this.height = h;
    }

    public double getArea(){
        return (base * height) / 2.0;
    }

    public void enlarge(int n){
        base = base * n;
        height = height * n;
    }
}
