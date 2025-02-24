package chapter17_static;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();

        System.out.println(product1.getInstanceCount());
        // instance count 확인 : 객체명.메서드명()           -scanner.nextInt() 와 유사하게 객체 만들고 메서드 호출
        System.out.println(product1.getCount());
        // 클래스명.메서드명()          - Arrays.toString() 과 유사하게 클래스로 바로 호출

        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();

        System.out.println(product2.getInstanceCount());
        System.out.println(product2.getCount());
        System.out.println(product3.getInstanceCount());
        System.out.println(product3.getCount());
        System.out.println(product4.getInstanceCount());
        System.out.println(product4.getCount());
        System.out.println(product5.getInstanceCount());
        System.out.println(product5.getCount());
        System.out.println(product6.getInstanceCount());
        System.out.println(product6.getCount());
        System.out.println(product7.getInstanceCount());
        System.out.println(product7.getCount());
        System.out.println(product8.getInstanceCount());
        System.out.println(product8.getCount());

        // 이상의 코드에서 확인할 수 있는점은
        // 모든 instanceCount의 값은 1이 된다
        // -> 처음에 인스턴스 변수로 instanceCount = 0; 으로 초기화 되어있는 상태에서
        // 객체 생성시에 instanceCount++;를 통해 1로 저장되고 그 이후에 조작하지 않았기 때문
        // setInstanceCount와 같은 메서드를 정의하지 않았으니까.

        // 하지만 static 변수인 count의 경우에는 객체가 생성될 때마다 누적적으로 변하는 것을 볼 수 있다는 점에서
        // 이는 객체 단위가 아니라 클래스 단위로 조작이 되는 변수임을 확인할 수 있습니다.

        // static이 있고 없고에 따른 변수 및 메서드의 성격상 차이를 아는 것이 중요합니다.
    }
}
