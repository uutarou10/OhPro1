package kg13;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Kadai01 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("C0115991",83);
        students[1] = new Student("C0115992",57);
        students[2] = new Student("C0115993",70);

        for (Student student : students) {
            System.out.println(student.getId() + ", " + student.getScore() + ", " + student.getGrade());
        }

        System.out.println("1番目の学生の得点に5点加えます");
        students[1].add(5);

        for (Student student : students) {
            System.out.println(student.getId() + ", " + student.getScore() + ", " + student.getGrade());
        }
    }
}
