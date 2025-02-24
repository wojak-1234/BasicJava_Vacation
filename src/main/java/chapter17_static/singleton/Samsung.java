package chapter17_static.singleton;

import lombok.Getter;

public class Samsung {
    // 필드 정의
    @Getter // 필드 위에 @Getter을 사용하면 getCompany만 만들겠다는 뜻입니다.
    private String company;   // -> 이 필드에는 getter가 없습니다.
    private int serialNumber;

    //여기서부터 singleton 패턴 작성 시작
    // 1. 스태틱 변수 정의 -> 보통 싱글톤 만들 때 객체명을 instance로 쓰는 편
    private static Samsung instance = null; // 자료형이 Samsung 인 정적 변수

    // 2. 기본 생성자 정의
    private Samsung() {
        company =  getClass().getSimpleName();  // 패키지 떼고 클래스 명만 가지고 온다.
        // -> Samsung 저장
        serialNumber = 20250000;
    }

    // 3. static 메서드를 정의 -> 대부분의 경우 getInstance()로 정의합니다.
    public static Samsung getInstance(){
        if(instance == null){       // 현재 인스턴스가 없다면 아래의 코드가 실행됨.
           Samsung instance = new Samsung();// samsung 클래스의 객체 생성
        }   // static 변수인 instance 에 대입
        return instance;    // instance가 이미 있다면 return 만 실행
        // 만약 이상의 조건문이 실행되지 않는다면 이미 기존의 instance 가 있다는 의미이므로
        // 즉, getinstance() 메서드는 실행되기만 하면 어쨋든 samsung 클래스의 객체가
        // return 된다고 볼 수 있습니다.ㅌ
    }

    public String createSerialNumber(String model)
    {
        return model +"_"+ ++serialNumber;
    }
}

