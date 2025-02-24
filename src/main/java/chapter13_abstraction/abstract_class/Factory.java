package chapter13_abstraction.abstract_class;

public abstract class Factory {
    // 필드 선언
    private String name;

    public Factory(String name) {
        this.name = name;
    }
    /*
        추상 메서드의 정의
        : {}가 없는 애다 // 구현부가 없다 // method body가 없다
        access modifier와 return type 사이에 abstract를 삽입해주면 추상 메서드로 선언됨.
        -> 선언했으면 public과 class 사이에도 abstract 넣어줘야 오류가 나지 않습니다.

        왜? 추상 클래스의 정의 : 추상 메서드가 '하나라도' 있으면 추상 클래스
     */
    public abstract void produce(String model);
    public abstract void manage();

    // 여기부터는 추상 메서드가 아닌 애들이죠
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("공장의 정보를 출력합니다.\n공장 이름 : " + name);
    }
}