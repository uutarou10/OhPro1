package kg12;

import java.util.Random;

/**
 * Created by Kota Nonaka on 2016/07/07.
 */
public class Point {
    private int x;
    private int y;

    /**
     * 引数なしのコンストラクタは、
     * xを10以上20未満の乱数で、yを100以上110未満の乱数で初期化します。
     * 乱数の生成には getRand() メソッドを利用します。
     */
    public Point(){
        this.x = getRand(10,20);
        this.y = getRand(100,110);
    }

    /**
     * getRand()メソッドはint型の乱数を返します。
     * 乱数の範囲は base 以上 bound 未満です。
     *
     * @param base 乱数の下限
     * @param bound 乱数の上限(この値は含まない)
     * @return base 以上 bound 未満の乱数
     */
    private int getRand(int base, int bound){
        Random rand = new Random();
        return base + rand.nextInt(bound-base);
    }

    @Override
    public String toString(){
        return "(x, y) = (" + this.x + ", " + this.y + ")";
    }
}
