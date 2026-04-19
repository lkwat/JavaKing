package ch08;

public class Ch08_H07_Class {
    public static void main(String[] args) {
        String course = "計算機概論";
        Teacher teacher = new Teacher();

        System.out.println(teacher.school);
        System.out.println(teacher.job);
        teacher.work();
        System.out.printf("%s\n", course);
    }
}
class Teacher {
    String school = "明志科大";
    String job = "老師";
    void work(){
        System.out.println("教書");
    }


}