package chapter08_classes.student;
/*
    생성자를 자동 생성하는 방법

    메뉴바 (햄버거) 클릭 -> code - > generate -> constructor -> 클릭
    shortcut -> alt + insert

    어떤 빌드(속성)을 기준으로 생성자를 만들지 선택하면 된다.
 */
public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    }

}
