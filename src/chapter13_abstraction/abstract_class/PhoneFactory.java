package chapter13_abstraction.abstract_class;

public class PhoneFactory extends Factory{

    // 생성자 및 메서드를 일일이 복사 및 타이핑할 필요 x  -> 빨간거 뜰 때마다 딸깍딸깍했다
    public PhoneFactory(String name) {
        super(name);
    }

    // Factory 클래스에 있던 추상 메서드인 produce를 override하니까 구현부가 자동 생성됐습니다.
    // 우리는 PhoneFactory 클래스에서 추상 메서드를 구현부가 있는 메서드로 '재정의'해서 사용합니다.
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }

}