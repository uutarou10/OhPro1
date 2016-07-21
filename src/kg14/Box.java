package kg14;

/**
 * Created by Kota Nonaka on 2016/07/21.
 */
public class Box {
    private int width;
    private int height;

    public Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double getDiagonal() {
        return Math.sqrt((width * width) + (height * height));
    }

    public void changeSize(int dw, int dh) {
        width += dw;
        height += dh;
    }

    public String toString() {
        return width + " x " + height;
    }
}
