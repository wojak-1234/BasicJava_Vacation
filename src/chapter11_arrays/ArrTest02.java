package chapter11_arrays;

import java.util.Scanner;
/*
    String[] names 배열을 생성하고
    몇 명의 학생을 등록하시겠습니까? >>> 9
    1번 학생 이름
    2번 학생 이름
    3번 학생 이름
    .
    .
    .
    ->
    출력 결과:
    1.
    2.
    3.
    4.
    ...

 */
public class ArrTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록하시겠습니까?");
        int howMany = scanner.nextInt();
        // nextint를 쓰게되면 숫자뒤에 입력을 마치는 공백까지 흡수하여 첫 입력이 누락됨.
        scanner.nextLine();
        // 매우 중요하다
        String[] strArr = new String[howMany];
        for(int i = 0; i < howMany; i++) {
            System.out.print((i+1)+"번째 학생의 이름 >>>");
            strArr[i] = scanner.nextLine();
        }
        System.out.println("출력 결과");
        for(int i = 0; i < howMany; i++) {
            System.out.print(i+1+"번째 학생 이름");
            System.out.println(strArr[i]);
        }
    }
}
