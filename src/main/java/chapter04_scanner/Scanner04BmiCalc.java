package chapter04_scanner;
/*
BMI 계산기를 작성합니다.

    1. 키를 cm로 입력 받습니다.
    2. 몸무게를 kg 단위로 입력 받습니다.
    3. bmi를 계산하는 방법 : kg / cm
    4. 콘솔창에 당신의 BMI 지수는 xx.xxxx 입니다"
 */

import java.util.Scanner;

public class Scanner04BmiCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 키(cm)를 입력하세요 >>>  ");
        double height = scanner.nextDouble();
        System.out.print("당신의 몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double BMI = (double)( weight / (height * height) * 10000);
        System.out.print("당신의 BMI는 " + BMI );
    }
}
