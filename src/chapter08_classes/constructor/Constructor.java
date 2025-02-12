package chapter08_classes.constructor;
/*
    생성자(Constructor) :
        생성자는 객체가 생성될 때 호출되는 '특별한' 메서드

    ClassExample example = new ClassExample();
    -> ClassExample 클래스의 객체를 생성 -> 객체 이름 : example
    까지는 저희가 수업한 내용에 해당합니다.
    사실은
    new ClassExample();이 생성자에 해당합니다.

    특징 :
        1. 클래스의 이름과 생성자 이름은 동일하다(즉, 다른 메서드들과 달리 대문자로 시작)
        2. return 값이 없다 -> call1(), call2() 유형이 떠올랐다면 성공적
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당함.

    생성자의 정의 방식 :
        1. 기본 생성자 : 매개변수가 없는 생성자(사실 클래스를 만들 때 default로 생성되어
            정의하지 않아도 될 때가 있음)
            ClassA, Car에서 기본 생성자를 정의하지 않고, ClassAMain에서, CarMain에서
            객체를 생성했었습니다 -> 복습하셔야 합니다.
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자 -> 이건 이제 수업 예정
 */
public class Constructor {
    // 필드(속성) 선언
    int num;
    String name;

    // 기본 생성자를 직접 작성해볼 예정 -> call1() 유형으로 작성이 되겠죠.
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수 생성자 -> 기본적으로 만들어지지 않습니다 -> 개발자가 정의해야 함 -> call2() 유형
    Constructor(int num) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = num; // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체됨.
    }
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
    }
    // 예를 들어 Constructor con1 = new Constructor(10);으로 했다면
    // this 부분이 con1으로 대체됨.

    }