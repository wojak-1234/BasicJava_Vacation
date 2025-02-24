package chapter05_condition;

import java.util.Scanner;

public class Condition06{
public static void main(String[] args)
{
    /*
    사용자로쿠터 score 을 입력 받아 다음과 같은 조건을 만족시키도록 작성하시요

    score 가 0 <  < 100

    changedscore - > 9 ~ 10 : grade = A


    If 문들 통해서 0 미만 100 초과 걸러내는 작업 , switch - case 를 통해서 나머지 부분을 작성.
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int score = scanner.nextInt();
    int changedScore = score / 10;
    String grade = "";
    if (changedScore <= 10 && changedScore >= 0)
        {
        switch (changedScore) {
            case 10:
                grade = "A";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                            }
        }
    else grade = "x";
    System.out.println("당신의 등급은 "+ grade + " 입니다.");
    }
}
