package chapter08_classes.student;
class Showinfo{
    public Showinfo(){
    }
}
public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "김일";
        student1.studentCode = 2025001;
        student1.score=4.5;
        Student student2 = new Student(2025002);
        student2.score=100;
        student2.name="김이";
        Student student3 = new Student("김삼");
        student3.score=95.8;
        student3.studentCode=2025003;
        Student student4 = new Student(2025004,"김사");
        student4.score=4.0;
        student1.showinfo();
        student2.showinfo();
        student3.showinfo();
        student4.showinfo();
    }
}