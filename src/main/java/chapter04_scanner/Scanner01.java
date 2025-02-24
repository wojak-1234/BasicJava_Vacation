package chapter04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner Class import
        Scanner scanner = new Scanner(System.in);
        System.out.print("올해 년도를 입력하세요 >>> ");      //앞으로 print와 println 을 구분할 예정,
        int year = scanner.nextInt();   // 명령어에 관련된 부분은 추후 설명 예정.
        System.out.println(year);
        /*
            int 입력하고 싶으면 scanner.nextInt();
            double 입력하고 싶으면 scanner.nextDouble();

            String은?
         */
        String year1 = scanner.nextLine();
        System.out.println("올해"+year1+"임");
        //year1을 String 자료형으로 선언했기 때문에 수학 연산이 불가능해져서 2025를 입력했을 때 20251로 출력
        /*
            Scanner을 사용했을때 그 결괏값을 변수에 대입하는 경우, 변수의 '자료형이 매우 중요'합니다.

            scanner.nextInt() / scanner.nextLine()을 이용하면 콘솔창에 사용자가 원하는 값을 입력 가능
            그리고 그 결과값을 각각 int year / String year1에 대입했습니다.

            즉 결과값이 변수에 대입되었음을 의미 -> 대입연산자 개념을 떠올려야 한다.
            애초에 변수를 선언하면서 어떤 자료형이 될지 미리 고려한다면 자동완성을 통해
            nextInt(), nextDouble(), nextLine()을 추천해줍니다
         */
    }
}
