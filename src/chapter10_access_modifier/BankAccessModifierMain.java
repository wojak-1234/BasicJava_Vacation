package chapter10_access_modifier;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        BankAccessModifier account01 = new BankAccessModifier();
        BankAccessModifier account02 = new BankAccessModifier(1234567);
        BankAccessModifier account03 = new BankAccessModifier(2345678, "김삼");
        BankAccessModifier account04 = new BankAccessModifier(3456789, "김사", -100000);
        BankAccessModifier account05 = new BankAccessModifier(4567890, "김오", 200000, 123456);

        account01.setAccountNumber(0123456);
        account01.setAccountHolder("김일");
        account01.setBalance(10000000000L);         // long에 해당하는 숫자 데이터임을 명시하기 위해 뒤에 L을 붙여주면
        // 대충 컴퓨터가 이 자료형이 long임을 알아차리고 더 큰 숫자도 처리해줌.
//        account01.setPinNumber(12345);              // 현재 별 문제 없이 저는 작성 가능 -> 아직 setPinNumber()에
        // 로직을 작성하지 않았기 때문에

        account01.setPinNumber(1234);

        account02.setAccountHolder("김이");
        account02.setBalance(2000);
        account02.setPinNumber(1234);

        account03.setBalance(30000);
        account03.setPinNumber(2345);

        account04.setPinNumber(3456);

        // 이상의 코드까지 다 입력했을 때 객체 5개를 서로 다른 생성자를 통해서 만들었고, null값 혹은 0인 속성에 값 대입까지
        // 완료했습니다.

        account01.showAccountInfo();
        account02.showAccountInfo();
        account03.showAccountInfo();
        account04.showAccountInfo();
        account05.showAccountInfo();

        // setPinNumber() 확인

        account01.setPinNumber(98765);
        System.out.println(account01.getPinNumber());

        // setBalance() 확인

        account01.setBalance(-1000);
        System.out.println(account01.getBalance());

        // deposit() 확인
        // account가 음수일 때의 실패 코드
        account01.deposit(-10, 1234);
        // inputPint이 틀렸을 때의 실패 코드
        account01.deposit(10, 2345);
        // 성공 코드
        account01.deposit(1000, 1234);

        // withdraw() 검증
        // account가 음수일 때 실패 코드
        account01.withdraw(-10, 1234);
        // inputPin이 틀렸을 때 실패 코드
        account01.withdraw(10, 9876);
        // 너무 많이 출금해서 최종 계산 금액이 음수일 때 실패 코드
        account01.setBalance(1000);
        account01.withdraw(20000, 1234);
        // 성공 했을 때
        account01.withdraw(500, 1234);



    }
}