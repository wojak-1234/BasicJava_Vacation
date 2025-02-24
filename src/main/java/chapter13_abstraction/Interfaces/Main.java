package chapter13_abstraction.Interfaces;
/*
    인터페이스(interface)
        인터페이스는 자바에서 클래스가 구현해야하는 '메서드들'의 집합을 정의하는
        일종의 규약

        인터페이스는 메서드의 시그니처(메서드 이름, 리턴 타입, 매개변수 목록)만을
        포맣마녀, 메서드의 실제 구현은 포함하지 않음.
            -> 추상 메서드와 유사한 점

        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음
            : 추상 클래스는 단일 상속을 지원해서 상속 과정을 알아보기 쉽다.

        특징
            1. 추상메서드 : 인터페이스 내의 모든 메서드들은 기본적으로 추상 메서드
            2. 상수 : 인터페이스 내에서 선언된 변수는 모두 '자동으로'
                public static final 상수로 처리됨.
            3. 다중상속 : 클래스는 여러 인터페이스를 구현할 수 있다.

        추상 클래스와의 공통점 :
            - 모두 추상 클래스를 포함할 수 있고, 이를 서브 클래스에서 구현해야 한다.

        추상 클래스와의 차이점 :
            - 추상 클래스
                1. 부분 구현 허용 : 추상 클래스는 추상 메서드 뿐만 아니라 일반
                    메서드도 포함할 수 있다.
                2. 상태 저장 기능 : 추상 클래스는 인스턴스 변수(상태)를 가질 수 있다.
                3. 단일 상속 : 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
                4. 생성자 : 추상 클래스는 생성자를 가질 수 없다.
                5. 다양한 접근 제어자 : 추상 클래스의 메서드와 변수는 다양한 접근 제어자(public,
                private , protected)를 가질 수 없다.
            - 인터페이스 :
                1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상 메서드
                    Java 8 이후에 default static 메서드를 사용할수 있긴함.
                2. 인터페이스는 인스턴스 변수(필드 중 객체마다 값이 다른 변수)를 가질 수 없고, 상수만 선언 가능
                3. 다중 상속 : 클래스는 여러 인터페이스를 '구현할 수 있다.'
                4. 생성자 없음 : 인터페이스는 생성자를 가질 수 없다.
                    -> 일단 필드에서 객체마다 다른값을 가지게 되는 인스턴스 변수를 가질 수 없다 -> 생성자 생성이 불가능
                5. 자동 public : 인터페이스의 메서드들은 자도응로 public이라서 메서드 선언에 접근 제어자를 명시할 필요가 없다.
 */
public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController(
                new PowerButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
                        );
        //RemoteController remoteController = new RemoteController(); 까지 작성했을 경우이
        /*
            저희가 매새변수 생성자로 정의했기 때문에 오류가 발생합니다.
            그래서 argument들을 채워넣을 필요가 있는데,

            RemoteController의 객체를 생성했고, 객체명이 remoteController 입니다.
            클래스명1 객체명1 = new 클래스명1(argument1, argument2)
            클래스명2 객체명2 = new 클래스명1(new 클래스명3(), new 클래스명4(), ...)

            이상의 경우 new 클래스명3(), new 클래스명4()를 통해 객체 생성은 이미 완료 되었습니다.
                -> 생성자의 정의 : 객체가 생성되었을 때 자동으로 호출되는 특별한 메서드
            다만 차이점은 -> 객체명이 없을 뿐이다.
         */

        remoteController.onPressedPowerButton();
        remoteController.onPressedPowerButton();
        /*
            다중상속을 지원하지 않는 Java 클래스에서 remoteController라는 객체가
            PowerButton / VD / VU 에 있는 메서드 5개를 전부 호출할 수 있도록 하기 위해
            필드로 PB / VD / VU를 가지고, 생성자의 argument로 사용한 다음
            RemoteController의 일반 메서드로 PB의 메서드 호출을 할 수 있도록 정의

            그리고 Main.java 에서 remoteController.onPressedPowerButton();로 호출하면
            onPressedPowerButton(); 얘가
            powerButton.onPressed(); 얘를 또 따로 호출해서
            이중 호출을 하는 방식으로 전체 기능을 구현할 수 있도록 작성함.

         */
        remoteController.onPressedVolumeDownButton();
        remoteController.onDownVolumeDownButton();

        remoteController.onDownVolumeUpButton();
        remoteController.onPressedVolumeUpButton();
    }
}

