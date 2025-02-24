package chapter17_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        // SmartPhone의 객체 생성
        // 잘못된 사례입니다.
//        Smartphone smartPhone1 = new Smartphone("Samsung","갤럭시S27","2024000");
//        System.out.println(smartPhone0);

        // 싱글톤 패턴을 사용하고 -> factory 객체를 통한 smartphone 객체 생성
        Smartphone smartPhone1 = factory1.produceSmartPhone();
        Smartphone smartPhone2 = factory2.produceSmartPhone();
        Smartphone smartPhone3 = factory3.produceSmartPhone();
        Smartphone smartPhone4 = factory4.produceSmartPhone();
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);

    }
}
