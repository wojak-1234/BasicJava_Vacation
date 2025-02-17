package chapter12_inheritance;

public class Tiger extends Animal{  // (자식)클래스명 extends (부모)클래스명 를 통해 상속 가능

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);                  // super키워드
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override                           // @Override가 붙어있다면 해당 메서드는 상속 받은 메서드라는 의미
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
//        super.move();       // super()는 생성자에 해당 / super.메서드명()은 부모 클래스의 메서드를 호출
        System.out.println("호랑이가 네 발로 걷습니다");   // 재정의한 영역
    }

    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}