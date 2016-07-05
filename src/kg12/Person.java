package kg12;

/**
 * Created by Kota Nonaka on 2016/07/05.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public void diet(double w) {
        if (w < 0)throw new IllegalArgumentException();

        weight -= w;
    }
}
