package chapter15_objects.teacher;

import java.util.Objects;

public class Teacher {
    // 필드 선언
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // 바로 Object 클래스의 메서드들을 Override할겁니다.

    // alt + ins 전체 Object 메서드들을 가지고 올 경우
    // toString()이 재정의된 형태가 아니라
    // Object 클래스의 메서드 그 자체가 불러와짐
    // -> 객체명을 sout 했을 경우 주소값만 출력됨.

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    // 그래서 사람이 알아볼 수 있는 형태로 필드명과 그 값을 출력하는 형태로
    // toString()을 자동 재정의한 방식으로 불러내는 방법은
    // alt + ins -> toString()


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}