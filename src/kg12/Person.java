package kg12;

import java.util.Random;

/**
 * Created by Kota Nonaka on 2016/07/07.
 */
public class Person {
    /** 名前 */
    private String name;
    /** 身長 */
    private double height;

    /**
     * このコンストラクタは、フィールドの name を引数の値で初期化します。
     * フィールドの height は 140.0 以上 190.0 未満の乱数で初期化されます。
     * @param name 初期化後の名前
     */
    public Person(String name) {
        this.name = name;
//        this.height = new Random().nextInt(140 + (190 - 140));
        this.height = Math.random() * (190.0 - 140.0) + 140.0;
    }

    /**
     * このインスタンスの名前・身長が含まれた文字列を返します。
     * 身長は小数点以下2桁で四捨五入した文字列に変換されます。
     * @return このインスタンスの名前・身長が含まれた文字列
     */
    @Override
    public String toString(){
        return "Person{nama=" + this.name + ", height=" + String.format("%.1f",height) + "}";
    }

    public String getName(){
        return this.name;
    }

    public double getHeight(){
        return this.height;
    }
}
