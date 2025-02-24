package chapter08_classes.Products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productname="LG엘패드";
        product1.productnum=123456;
        Product product2 = new Product(987654);
        product2.productname = "다이소 충전기";
        Product product3 = new Product("USB - C 케이블");
        product3.productnum=159357;
        Product product4 = new Product(951753,"GFlip6");        product1.showinfo();
        product2.showinfo();
        product3.showinfo();
        product4.showinfo();
    }
}
