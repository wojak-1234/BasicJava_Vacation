package chapter05_condition;

import java.util.Scanner;

/*
    3. if - else / else if - else : if -else문과 달리 else if 문에넌 별도의 조건식이 요구됨
 */
public class Condition2 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    // 2. 사용할 변수 및 상수 선언 및 초기화
        int point = 0;
        final int VIP = 80;
        final int GOLD = 60;
        final int SILVER = 40;
        final int BONZE = 20;

        System.out.println("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();
        if (point > VIP) {
            System.out.println("vip");
        }
        else if (point > GOLD) {
            System.out.println("gold");
        }
        else if (point > SILVER) {
            System.out.println("silver");
        }
        else if (point > BONZE) {
            System.out.println("bonze");
        }
        else {
            System.out.println("normal");
        }
    }
}
