package chapter15_objects.students;
/*
    1. 해당 클래스에 학생 이름(name), 학번(studentID)를 String , int 로 저장하는 필드 작성하시오
    2. toString()을 Override 받고, 재정의하여 다음과 같이 콘솔에 찍히도록 작성하시오
        해당 학생의 학번은 ~ 이고 이름은 ~ 입니다.

    3. 해당 지시 사항을 만족하시오.
        1) Student 클래스는 name과 studentId를 private
        2) AllArgsConstructor 생성자
        student 1= 최민준 20250001
        studnet 2= 안근수 20250002
        field 별로 setter . getter 생성

 */
public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "해당 학생의 학번은" +
                 studentId +" 이고,"+
                " 이름은: " + name +
                "입니다.";
    }
}
