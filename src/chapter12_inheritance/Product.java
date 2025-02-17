package chapter12_inheritance;

public class Product extends Item {
    // 자식 class 만의 필드
    private int price;
    private int stock;

    public Product(int price, int stock,String name, String category) {
        super(name, category);  // 부모의 field 들을 가지고 오는 super() 키워드
        this.price = price;     // 자식 class의 field 생성자 만들때 쓰던 거 그대로
        this.stock = stock;     //
    }

    // 부모 field 에 관한 setter getter

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    // 자식 field 에 관한 setter getter

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //고유 메서드 추가
    public void displayInfo()
    {
        System.out.println("제품명 :" + this.getName());
        System.out.println("카테고리 :" + this.getCategory());
        System.out.println("가격 :" + this.getPrice());
        System.out.println("재고 :" + this.getStock());

    }
}
