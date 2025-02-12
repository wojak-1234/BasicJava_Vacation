package chapter09_setter_getter;

public class Person {
    // 필드(속성) 선언
    private String name;
    private int age;

    // 기본 생성자, 매개변수가 하나인 매개변수 생성자 두 개, 매개변수가 두 개인 매개변수 생성자 하나
    // 를 생성하시오.

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 구조 : set+필드명으로 이루어지는 편입니다.
    // call2()유형으로 만들어집니다. -> void / 매개변수 있음
    // 값을 대입하거나 변경할 argument가 필요하기 때문에

    public void setName(String name) {
        // setName의 경우 메서드이기 때문에 내부에 로직을 설계 가능한데,
        // String name의 길이가 4글자 초과라면 메서드를 강제 정지시킴으로써 입력을 불가능하게
        // 막을 수도 있음.
        if (name.length() > 4) {
            System.out.println("이름의 글자 수를 초과했습니다.");
            return;             // 메서드에 return;으로 작성하면 메서드 자체 종료
        }
        System.out.println("이름을 수정합니다.");
        System.out.println("변경 전 이름 : " + this.name);
        this.name = name;       // 여기서 argument로 받은 매개변수를 필드에 대입
        System.out.println("수정 후 이름 : " + this.name);
    }

    // setAge()- 매개변수 1개/와 setInfo()- 매개변수 2개/를 정의하시오.
    public void setAge(int age) {
        // 0 미만이고 200 초과의 값이 입력됐을 경우에는 "불가능한 나이 입력입니다."
        // 라고 출력시키고,
        // 0 이상 200 이하의 값이 입력됐을 경우에 값 대입이 이루어지고,
        // "나이가 입력되었습니다."라고 출력하는 로직을 완성하시오.
        if ( age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return;
        }
        System.out.println("나이가 입력되었습니다.");
        this.age = age;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 구조 get + 필드명으로 이루어지는 편입니다.
    // call3() 유형으로 생성 -> return 값 있고, 매개변수 없음
    // 데이터의 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 안에 아무것도 없다.
    // 필드와 동일한 자료형의 return값이 요구되기 때문에 -> void가 아니다.
    public String getName() {
        return name;
    }

    // getAge()를 정의하시고, PersonMain.java에서 person01 객체를 나이를 조회하여
    // "저는 올해 --살입니다, 내년에는 --+1살이됩니다."가 출력되도록
    // Person.java / PersonMain.java를 작성하시오.
    public int getAge() {
        return age;
    }
    public String getInfo() {
        return this.getName() + " " + this.getAge();
    }

}