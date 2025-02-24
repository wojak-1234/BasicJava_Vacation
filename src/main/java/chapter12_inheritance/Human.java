package chapter12_inheritance;
/*
    Tiger.java에서처럼 Animal클래스를 상속 받고
    생성자 및 getter / setter 다 정의하시고
    Animal 클래스의 move() 메서드를 오버라이딩해서 "사람이 두 발로 걷습니다"를
    출력할 수 있도록 '재정의'하고

    Main.java에서
    human1 객체를 생성한 후, setter를 이용하여 여러분들의 이름, 나이를 입력,
    getter를 활용하여
    제 이름은 ____이고, 나이는 ____ 살입니다. 라고 출력하시오.

    Human클래스의 고유 메서드로 read("멘토 자바")를 정의하여 콘솔창에 출력합니다.

    실행 예
    두 발로 걷습니다.
    제 이름은 ____ 이고, 나이는 ____ 살입니다.
    멘토 자바 책을 읽고 있습니다.
 */
public class Human extends Animal{
    // Human 클래스만의 필드 선언
    String schoolName;

    public Human() {
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override
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
//        super.move();
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String bookTitle) {    // 지시사항 대로라면 argument가 있으므로 call2()유형으로 작성
        System.out.println(bookTitle + " 책을 읽고 있습니다.");
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}