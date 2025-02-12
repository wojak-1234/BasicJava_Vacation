package chapter08_classes.student;
/*
    1. Student 클래스의 필드를 정의하시오

    1) int studentCode
    2) String name
    3) double score

    2. 기본 생성자를 직접 작성하시고, 객체가 생성될 때
    "기본 생성자로 객체가 생성되었습니다" 라고 출력될 수 있도록 코드를 작성하시오.

    3. int studentCode를 매개변수로 하는 매개변서 생성자를 생성하고,
    "int 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    4. String name을 매개변수로 하는 매개변수 생성자를 생성하고
    "String 매개변수 생성자로 객체가 생성되었습니다" 라고 출력될 수 있도록 코드를 작성하시오.

    5. int studentCode, String name을 매개변수로 하는 매개변수 생성자를 생성하고,
    "int, String ㅁ개ㅐ변수 생성자로 객체가 생성되었습니다" 라고 출력

    6.
        1) student1 20250001 / 김일 / 4.5
        2) student2 20250002 / 김이 / 100
        3) student3 20250003 / 김삼 / 95.8
        4) student4 20250004 / 김사 / 4.0
 */
class Student{
    int studentCode;
    String name;
    double score;
    public Student(){
        System.out.println("기본 생성자로 객체가 생성되었습니다.");
    }
    public Student(int studentCode){
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다");
    }
    public Student(int studentCode, String name){
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다");
    }
    public Student(String name){
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다");
    }
    // call 1 타입으로 정의
    void showinfo() {
        System.out.println("학번 : "+ this.studentCode +"이름 : "+ this.name +"점수 :"+ this.score);
    }
}
