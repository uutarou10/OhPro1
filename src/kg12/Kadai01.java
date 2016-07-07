package kg12;

/**
 * Created by Kota Nonaka on 2016/07/07.
 */
public class Kadai01 {
    public static void main(String[] args) {
        Student std1 = new Student("C0115901",58);
        Student std2 = new Student("C0115902",76);

        System.out.println("=== RAW SCORE ===");
        System.out.println(std1.getStudentId() + ", " + std1.getScore() + ", " + std1.isPass());
        System.out.println(std2.getStudentId() + ", " + std2.getScore() + ", " + std2.isPass());

        std1.adjust(5);
        std2.adjust(-10);

        System.out.println("\n=== TUNED SCORE ===");
        System.out.println(std1.getStudentId() + ", " + std1.getScore() + ", " + std1.isPass());
        System.out.println(std2.getStudentId() + ", " + std2.getScore() + ", " + std2.isPass());

    }
}
