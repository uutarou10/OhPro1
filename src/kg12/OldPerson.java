package kg12;

/**
 * 人をあらわすクラス。
 * 人の名前、年齢、身長、体重を持ちます。
 *
 * @version 1.0
 * @author Kota Nonaka
 */
public class OldPerson {
    private String name;
    private double height;
    private double weight;

    public OldPerson(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /**
     * このインスタンスのBMI値を返します。
     * @return 体重 / (身長[m] * 身長[m])
     */
    public double getBMI() {
        return weight / (height * height);
    }

    /**
     * このインスタンスの体重から引数の値を引きます。
     * @throws IllegalArgumentException wが0未満のとき
     * @param w 引く重さ[kg]
     */
    public void diet(double w) {
        if (w < 0)throw new IllegalArgumentException();

        weight -= w;
    }
}
