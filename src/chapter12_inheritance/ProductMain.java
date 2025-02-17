package chapter12_inheritance;
/*
    부모 클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain 클래스를 생성

    1. field로 private String name, private String category를 선언
    2. 필드 둘 다 사용하는 생성자를 작성
        생성자 name / category 하나만 가지는 생성자를 2 개 만드는 것은
        불가능합니다. Item("스트링자료형")을 argument로 받았다고 가정할 때,
        컴퓨터는 "스트링자료형"을 name 에 대입해야 하는지 아니면 category에 대입해야하는지
        모르기 때문에.
    3. setter / getter 작성
    4. Product.java 로 가서 Item - 부모 클래스 / Product 자식 클래스가 되게끔
        명령어를 입력하세요.
 */
public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품","일반 카테고리");
//                item1.displayInfo();
        /*
        이상의 코드가 오류 발생한다는 점에서 알 수 있는점 :
        자식은 부모의 필드 및 메서드를 사용 가능(정의했다면)
        하지만 부모 클래스의 객체는 자식 클래스의 필드 및 메서드를 사용 불가

        item 클래스를 손대지 말고 이하의 출력문이 나오도록 작성하시오
        이 상품은 일반 상품입니다
        이 상품은 일반 카테고리입니다.
         */
        System.out.println("이 상품은 "+item1.getName());
        System.out.println("이 상품은 "+item1.getCategory());

        /*
            Product 클래스의 인스턴스인 product1을 생성하는데
            이름 -> 전자제품
            카테고리 -> 가전 제품
            가격 -> 100000
            재고 -> 10으로 생성
            setter 이용해서 가전 제품을 백색가전제품
            getter 이용해서 해당 제품은 백색 가전제품입니다 출력
         */
        Product product1 = new Product(100000,10,"전자'제품","가전제품");
        product1.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 "+product1.getCategory()+" 입니다.");

    }

}
