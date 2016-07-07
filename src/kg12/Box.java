package kg12;

import java.util.IllegalFormatException;

/**
 * Boxクラスは長方形をあらわすクラスである。
 * このクラスは height と width をフィールドとして持ちます。
 */
public class Box {
    /** 高さ */
    private int height;
    /** 幅 */
    private int width;

    public Box(){
        this.height = 3;
        this.width = 4;
        System.out.println("Boxクラスのインスタンスを作成しました。");
    }

    /**
     * この長方形の面積を取得できます。
     * @return height * width
     */
    public int getArea(){
        return this.height * this.width;
    }

    /**
     * setSize() メソッドは長方形の高さと幅の値を決定することができます。
     * @param height 変更後の長方形の高さ
     * @param width 変更後の長方形の幅
     * @throws IllegalArgumentException height または width が0未満の場合に発生します。
     */
    public void setSize(int height, int width) throws IllegalArgumentException {
        System.out.println("height=" + height + ", width=" + width + "に値を変更します");

        if (height < 0 || width < 0) {
            throw new IllegalArgumentException();
        }

        this.height = height;
        this.width = width;
    }
}
