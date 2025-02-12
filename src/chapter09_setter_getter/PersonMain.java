package chapter09_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체를 생성
        Person person01 = new Person(); //기본생성자라 정의하지 않아도 괜찮음.


//        person01.name = "안근수";     private 적용 후에는 오류가 발생하기 때문에 주석처리합니다.
//        person01.age = 1000;        // 필드에 직접 접근하여 데이터를 대입하는 방식
//
//        System.out.println(person01.age);

        // setter 적용 부분
        // 정의했듯이 setter는 method -> 호출 방식은
        // 객체명.메서드명() -> scanner.nextInt();

        person01.setName("안근수");
        person01.setName("김일이삼사오륙");    // 얘 실행해봐도 바뀌지 않았음을 확인할 수 있음.
        person01.setName("김칠");     // 얘가 호출 됐을 때 변경 전 이름이 안근수라는 점에서 알 수 있음.

        person01.setAge(1000);
        person01.setAge(30);

        System.out.println("제 이름은 " + person01.getName() + "입니다.");
//        System.out.println(person01.name);        // 오류 발생

        System.out.println("제 나이는 " + person01.getAge() + "살입니다. 내년에는 " + (person01.getAge()+1) + "살이 됩니다.");

        System.out.println(person01.getInfo());

        /*
            univ_student 패키지 생성
            UnivStudent 클래스 생성
         */
    }
}