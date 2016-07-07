package kg12;

/**
 * Created by Kota Nonaka on 2016/07/05.
 */
public class DocSample {
    public static void main(String[] args) {
        OldPerson teu = new OldPerson("teu",1.70,65.0);
        System.out.println(teu.getBMI());
        teu.diet(3.2);
        System.out.println(teu.getBMI());
    }
}
