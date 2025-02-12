package chapter04_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scanner02 {
    public static void main(String[] args) {
        /*
        문자열 입력
        scanner.next()      -> 띄어쓰기 포함 x
        scanner.nextLine()  -> 띄어쓰기 포함 o
         */
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
//        System.out.print("your name >>>");
//        String name = scanner.nextLine();
//        System.out.println("당신의 이름은"+name+"입니다.");

        /*
            실행 예

            이름을 입력하세요 >>> 여러분 이름
            주호를 입력하세요 >>> 여러분 주소(시 / 구)
            나이를 입력하세요 >>> 여러분 나이

            이름 : 여러분 이름
            주소 : 여러분 주소
            나이 : 여러분 나이
         */
        System.out.print("이름을 입력하세요 >>>");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요 >>>");
        String address = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>>");
        int age = scanner.nextInt();

        System.out.println("");
        System.out.println("이름 :"+name);
        System.out.println("주소 :"+address);
        System.out.println("나이 :"+age);
        System.out.println("내년나이"+(age+1));

        /*
        next() vs nextline()"
            1. 입력 단위 : next는 공백 이전까지의 단어를 읽고
            nextline은 줄바꿈 이전까지의 전체 문자열을 읽는다.
            2. 1.로 인한 문제점 : next 다음에 nextline 을 혼합하여 쓰게 될 때,
            nextline 호출하기 전에 next를 먼저 사용하게 되면 next 입력하고  난 후에
            전 enter 키로 인해 nextline이 입력을 무시하고 다음 코드라인을 읽어들이면서 빈 문자열만 저장
            3. 해결 방안
            2.는 java 상에서의 대표적인 scanner 관련 문제로 ,이를 막기 위해 enter 키를 흡수해주는 베리어를 코드라인으로 삽입할 필요갸 있음.
         */
    }

}
