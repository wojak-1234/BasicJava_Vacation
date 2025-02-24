package chapter12_inheritance;
/*
    상속(inheritance)란?
        : 객체 지향 프로그래밍(OOP : Object-oriented Programming)의 핵심 개념 중 하나로,
        기존 클래스(부모(슈퍼) 클래스)의 속성과 메서드를 재사용하여 새로운 클래스(자식(서브) 클래스)를
        만드는 것을 의미함.

    1. 상속의 필요성
        : 상속을 통해 공통적인 기능을 부모 클래스에 정의하고, 이를 '여러' 자식 클래스가 재사용 가능
        ex) 동물(Animal) 클래스가 있고, 이를 상속 받는 개(Dog), 고양이(Cat)이 있다고 가정
        동물의 공통적인 속성(ex) 이름, 나이)와 행동(ex) 걷기, 먹기)을 부모 클래스에 정의,
        개와 고양이는 각각 고유한 특성(ex) 짖기 / 울기)을 추가할 수 있음

        위의 과정을 거쳤을 때 얻을 수 있는 이점 : 중복된 코드를 작성하지 않아도 됨.

        이전에는 Dog 클래스에 이름, 나이라는 필드 선언, 걷기, 먹기 메서드 정의한 후
        Cat 클래스에 이름, 나이 필드를 또 선언하고, 걷기, 먹기 메서들를 정의해야 했다면
        이제는 해당 부분에 대한 코드 중복을 줄일 수 있다는 점에서 상속의 의의가 있다고 할 수 있음.

    2. 상속의 특징
        1) 단일 상속 : 자바는 단일 상속만 지원함. 하나의 클래스는 한 번에 하나의 부모 클래스만
            상속 받을 수 있어 상속 구조가 간단하고 명확함
        2) super 키워드 : 클래스의 생성자 및 setter에서 학습한 this와 비슷한 개념으로
            부모 클래스의 필드에 접근하거나 부모 클래스의 생성자를 호출할 때 사용함.
        3) method override : 자식 클래스에서 부모 클래스의 기본 동작을 '재정의'할 수 있음.
            이를 통해 자식 클래스는 부모 클래스의 기본 동작을 자신만의 방식으로 변경 가능
        4) final 키워드 : 클래스 메서드에 final을 사용하면 상속이 제한됨.
            final 클래스 : 상속 자체가 불가능
            final 메서드 : 메서드 오버라이딩 불가능

    3. 상속의 장점
        1) 코드 재사용성 : 동일한 코드를 반복적으로 작성하지 않아도 됨.
        2) 유지 보수의 용이성 : 부모 클래스의 변경 사항이 자식 클래스에 반영되기 때문에
            수정이 용이함.
        3) 객체 간 관계 표현 : IS-A 관계를 명확히 나타냄.
            IS-A 관계란? ex) '개'는 '동물'의 일종이다. 라는 의미로,
            IS-A는 is a kind of의 축약어
            즉, 우리가 만든 클래스들을 기준으로 봤을 때는
            Tiger는 Animal의 일종이다. 라고 정리할 수 있음.

 */
public class Main {
    public static void main(String[] args) {
        // Animal 클래스의 객체 생성
        Animal animal1 = new Animal();  // 기본 생성자
        Animal animal2 = new Animal("바둑이");  // String 매개변수
        Animal animal3 = new Animal(1);  // int 매개변수
        Animal animal4 = new Animal("나비", 2);  // 둘 다

        // 이상의 코드가 여태까지 저희가 해온 방식입니다.
        // 예를 들어 Dog, Cat라든지 클래스를 정의할 때는 추가적으로
        // 매번 필드 / 생성자 / setter / getter 그리고 고유 메서드 등을
        // 작성해야 했습니다. -> 이를 해결하기 위한 방법이 상속(inheritance)
        // Tiger.java 클래스를 생성

        Tiger tiger1 = new Tiger("티거", 4);
        tiger1.move();
        tiger1.hunt();

        // Human 객체 생성
        Human human1 = new Human();
        human1.setAnimalName("김일");
        human1.setAnimalAge(20);
        System.out.println("제 이름은 " + human1.getAnimalName() + "입니다. 나이는 " + human1.getAnimalAge() + "살 입니다.");
        human1.move();
        human1.read("멘토 자바");

    }
}