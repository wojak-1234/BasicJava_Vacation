package chapter15_objects.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("최민준",20250001);
        Student student2 = new Student("안근수",20250002);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
