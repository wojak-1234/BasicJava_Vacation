package chapter16_bean.persons;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    // 필드 선언
    // 접근 지정자와 자료형 사이에 final 을 명시하는 경우

    // 이하의 코드는 그대로 뒀을 경우 빨간줄이 뜨는데, 해결방법이 두가지가 있습니다.
    // 1. name에 값을 대입해 상수를 초기화하는 법(그런경우 NAME으로 표기하죠)
    // 2. final이 붙은 변수를 필수적을 포함하는 매개변수 생성자를 만들 것.
    private final String name;
    private int age;
    // 필수적인 필드를 포함 한 RequiredArgsConstructor를 생성
    public Person(String name) {
        this.name = name;
    }
    // 필수 필드 및 옵션 필드를 전부 포함한 생성자 -> AllArgsConstructor

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "나이=" + age +
                ", 이름='" + name + '\'' +
                '}';
    }

}
