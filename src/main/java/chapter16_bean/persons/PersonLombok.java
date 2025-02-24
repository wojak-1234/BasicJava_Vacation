package chapter16_bean.persons;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonLombok {
    private final String name;
    private int age;
    /*
        Lombok annotation을 사용하여 생성자 / getter / setter을 만들어 줍시다.
        PersonMain으로 가서
        PersonLombok 클래스의 객체 person2를 생성후(name만)
        toString 메서드를 정의하여


        이름 : ~~
        나이 : ~~

        출력
     */
        /*
            @Data를 사용했을 경우
            @ToString이 포함돼있긴 하지만,
            여러분들이 코드 화단에 toString()을 Override 받아 재정의했을 경우
            재정의한 ToString이 우선적으로 사용된다.
         */
}
