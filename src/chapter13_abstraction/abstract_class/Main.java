package chapter13_abstraction.abstract_class;
/*
    abstract : 추상적인

    추상 클래스
    1. 추상 메서드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의돼야 함.
    2. 추상 클래스는 객체를 생성할 수 없습니다 -> 일반 클래스와의 차이점
    3. 그 외의 다른 특징은 일반 클래스와 동일함
    4. 상속을 전제로 하는 클래스

    추상 클래스 : 추상 메서드가 하나 이상인 클래스
    추상 메서드 : 선언만 있고, 구현은 없는 메서드

    추상 클래스의 장점 :
        코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

    추상 클래스의 목적 :
        1. 공통된 기능 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상
            클래스에서 정의 가능
        2. 구체적인 구현 강제 : 추상 메서드를 통해 자식(서브) 클래스가 반드시
            특정 메서드를 구현하도록 강제할 수 있음.
        3. 코드의 재사용성 : 중복되는 코드를 줄이고, 유지 보수성을 높일 수 있다.

    추상 클래스에서 주의할 점 :
        - 추상 클래스는 객체를 생성할 수 없다.

    super 키워드 - 슈퍼 클래스의 멤버 및 메서드에 접근하기 위해서 사용
        1. super(매개변수) -> 서브 클래스에서 슈퍼 클래스로 생성자를 호출할 때 사용
        2. super.메서드명() -> 서브 클래스에서 슈퍼 클래스로 메서드를 호출할 때 사용

    생성할 클래스 목록
        Factory.java
        PhoneFactory.java
        TabletFactory.java
 */
public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성이 불가능하다고 했습니다
//        Factory factory1 = new Factory("임시 공장") {
//            @Override
//            public void produce(String model) {
//                System.out.println(this.getName() + "에서 [ " + model + " ]을 생산합니다.");
//            }
//
//            @Override
//            public void manage() {
//                System.out.println(this.getName() + "에서 야근 중입니다.");
//            }
//        };
//
//        factory1.produce("백색 가전 냉장고");
//        factory1.manage();
        // 근데 이상의 개념은 익명 클래스로 Java 17(11일수도 있습니다...)에 적용되었습니다.
        // 재사용하지 않고 한 번만 사용하고 치울 예정이라면 사용하기에 좋습니다.

        // 객체 생성
        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");


        // 슈퍼 클래스의 추상 메서드를 각 서브 클래스들이 구현부를 작성해 호출한 예시
        phoneFactory1.produce("아이폰17");
        tabletFactory1.produce("아이패드 프로 13인치 8세대");

        // 슈퍼 클래스의 일반 메서드를 서브 클래스에서 호출한 예시 -> @Override를 하지 않았는데
        // 사용이 가능하다는 점에 주목해야합니다.
        phoneFactory1.manage();
    }
}