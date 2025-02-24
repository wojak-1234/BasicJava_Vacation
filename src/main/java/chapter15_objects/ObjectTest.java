package chapter15_objects;
/*
    모든 클래스는 Object 클래스를 상속 받는다
    -> interface 부분을 override methods했을 때 Object 클래스와 관련된 부분을
    확인했었습니다.

    toString(), equals(), hashCode()

    1. toString() : 객체의 문자열 표현
        기본적으로 모든 클래스는 Object 클래스를 상속 받으며, Object의 toString()
        메서드는 클래스 이름과 해시코드(주소지라는 표현으로 써옴)를 반환함.
        -> 이를 Override하여 재정의해서 필드를 표현하는 등 다양한 방식으로
        변환시켜 사용하는 편

        왜 사용하는가? : 사람들이 읽기 편한 방식으로 재정의하고, 객체명만으로
            불러오는 것이 가능함. 즉, 객체명.toString()으로 쓰지 않고,
            객체명 만으로 호출 가능

    2. equals() : 객체의 동등성 표현
        두 객체가 '논리적으로 같은지'를 비교하는 메서드
        기본적으로 Object 클래스의 equals() 메서드는 두 객체의 참조 주소를 비교합니다.
        형식 :
            객체명1.equals(객체명2)
            -> 객체명1과 객체명2의 참조 주소가 동일한지 확인
            : 3형식 문장처럼 생각하시면 됩니다.

    3. hashCode() : 객체의 고유 값
        객체를 정수 값(해시값)으로 반환
        해시 값은 주로 해시 기반 컬렉션에서 사용됩니다(추후 수업 예정)
        equals()를 override를 하면 hashCode()도 '반드시 override해야 합니다.'
            - 동일한 객체(equals() == true)는 동일한 해시 코드를
            가져야 하기 때문인데, 문제는 해시 코드가 같다고 해서 항상 equals()가
            true가 아닐 때가 있습니다.

    그래서 equals를 어디서 저희가 확인했냐면
 */
public class ObjectTest {
    private String name;
    private String address;

    // 기본 생성자, 매개변수 생성자(AllArgsConstructor)

    // getter / setter 정의하세요

    //displayInfo1()을 정의하세요. -> call1() 유형으로
    // 실행 예:
    // 이름 : 최민준
    // 주소 : 부산광역시 동래구

    public ObjectTest(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo1()
    {
        System.out.println("이름 : "+name);
        System.out.println("주소 : "+address);
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    // tostring 오버라디이 함.


}