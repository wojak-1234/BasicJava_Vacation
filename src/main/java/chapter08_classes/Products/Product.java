package chapter08_classes.Products;
/*
    여러 가지 생성자를 정의하세요.
    기본 생성자
    매개변수 생성자

    필드는

    int productNum;
    String productName;

    메서드는

    showInfo() -> productNum과 ProductName 정보가 콘솔에 출력되도록 작성

    즉 생성될 수 있는 생성자의 경우의 수는 4 가지.

    1. 기본 생성자를 사용해서 객체 생성하세요. product1
        productNum 123456
        productName LG엘패드

    2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해서 객체 생성하세요. product2
        productNum 987654
        productName 다이소충전기

    3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해서 객체 생성하세요. product3
        productNum 159357
        productName USB-C 케이블

    4. AllArgsConstructor를 이용해서 객체 생성하세요. product4
        productNum 951753
        productName GFlip6

    5. showInfo()는 call1 방식으로 다음과 같이 실행됩니다.
        제품 번호 : 뭐어쩌고
        제품 이름 : 뭐저쩌고

    6. ProductMain.java 만들어서 이상의 상황을 모두 만족시키도록 객체 생성 및 속성 대입 그리고 메서드를 실행하시오.
 */
class Product{
    int productnum;
    String productname;
    public Product()
    {

    }
    public Product(int productnum)
    {
        this.productnum = productnum;
    }
    public Product(int productnum, String productname)
    {
        this.productnum = productnum;
        this.productname = productname;
    }
    public Product(String productname)
    {
        this.productname = productname;
    }
    void showinfo()
    {
        System.out.println("product number is: " + productnum);
        System.out.println("product name is: " + productname);
    }
}
