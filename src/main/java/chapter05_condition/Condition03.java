

/*
사용자에게 score을 입력받아 당므과 같은 조건
90 ~ 100
A
80 ~ 89
B
70 ~ 79
C
60 ~ 69
D
else
F
 */
package chapter05_condition;

import java.util.Scanner;
public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score=0;
        score = scanner.nextInt();
        if(score<=100 && score>=70){
            char grade = (char)('A'+ 9 - (score/10));
            System.out.println("입력한 점수는 "+score+" 이며, 학점은 "+grade+" 입니다.");
        }
        else{
            System.out.println("입력한 점수는 "+score+" 이며, 학점은 x 입니다.");
        }
    }
}
// 조건마다 sout 이 있어서 grade 변수를 선언하여 사용하는 방식
// -> 먼저 grade x 조건 지정, 그 후 점수 구간대별로 grade 알파벳 지정 후 마지막에 sout 처리.