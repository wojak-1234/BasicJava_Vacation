package chapter17_static;
/*
    Static(정적) :
        클래스 수준에서 변수를 정의하거나 메서드를 선언할 때 사용.
        static으로 선언된 변수나 멧더ㅡ는 클래스의 인스턴스에 속하지 않고.
        클래스 자체에 속하게 된다.

        이는 인스턴스를 생성하지 않고 접근이 가능하다는 점에서
        일반적인 멤버 변수나 메서드와 구분이 된다.

    특징 :
        1. 클래스 수준의 변수 및 메서드 : static 변수와 메서드는 클래스 로드시 메모리에 할당
        2. 공유 : 모든 인스턴스가 동일한 static 변수에 접근한다. 따라서 데이터를 공유하거나
            상태를 저장하는 데에 유용함.
        3. 인스턴스 필요 없음 : 객체를 생성하지 않고도 클래스명.변수 / 클래스명.메서드명() 형태로
            직접 접근이 가능
        4. 메모리 효율성 : static 변수는 프로그램이 종료될 때까지 한 번만 메모리에 할당
 */
public class Product {
    // static 변수 -> 모든 클래스가 공유하는 변수
    private static int count =0;

    // 인스턴스 변수 -> 객체마다 서로 다른 값을 가지는 변수
    private int instanceCount=0;

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        count++;
        instanceCount++;
    }

    public static int getCount() {
        return count;
    }

    public int getInstanceCount() {
        return instanceCount;
    }
}
