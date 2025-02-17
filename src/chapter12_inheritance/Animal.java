package chapter12_inheritance;

public class Animal {
    // 필드 선언
    private String animalName;
    private int animalAge;

    // 생성자 하나 하나 정의하세요
    public Animal() {}

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
    // setter / getter 하나 하나 정의하세요
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // Animal 클래스의 메서드
    public void move() {
        System.out.println("움직입니다.");
    }
}