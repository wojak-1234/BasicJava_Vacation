package chapter07_methods;
/*
    점수들을 입력 받아서 총합 및 평균 점수를 내는 프로그램을 구현할 예정.
    여태까지는 main 단계에서 전체를 작성해왔습니다.

    하지만 이제터는 method 부분과 실행 부분(main 메서드가 적용된 부분)을 나누는 과정을
    거치도록 하겠습니다.
 */

import java.util.Scanner;

public class ScoreCalc {
    public static double addScores(double a, double b) {
        return a + b;
    }
    public static double addScores(double c, double d,double e) {
        return c+d+e;
    }
    public static double addScores(double f, double g, double h,double i) {
        return f+g+h+i;
    }
    public static double addScores(double k, double l, double m, double n, double o) {
        return k+l+m+n+o;
    }
    public static double addScores(double p, double q, double r, double s, double t, double u) {
        return p+q+r+s+t+u;
    }
        // 평균을 내는 메서드 call4유형으로 작성
    public static double calculateAvg(double totalScore, int numOfSubjects) {
        return totalScore / numOfSubjects;
    }
    //2. addscore 메서드를 오버로딩하여 매개 변수가 3,4,5,6인 메서드들을 만드세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        double score1 =0;
//        double score2 =0;
//        double totalScore = 0;
//        int totalSubjects = 0;
//        double avgScroe = 0;
//
//        System.out.print("점수를 입력하세요 >>>");
//        score1 = scanner.nextDouble();
//        System.out.print("점수를 입력하세요 >>>");
//        score2 = scanner.nextDouble();
//        totalScore = score1 + score2;
//
//        totalSubjects = 2;
//        avgScroe = totalScore / totalSubjects;
//        System.out.println("당신의 총점은 : "+ totalScore);
//        System.out.println("당신의 평균은 : "+ avgScroe);
        // System.out.println(calculateAvg(addScores(100,80),2));

        //여태까지 매번 변수 선언하고 초기화해서 대입하면서 sout 했던 사례

        double totalScore2 = addScores(100,90);
        int subs = 2;
        double avgScore = calculateAvg(totalScore2, subs);
        System.out.println(avgScore);
        // 가독성은 좀 깨지지만, 여전히 개발자들이 사용하는 방식.
        System.out.println(calculateAvg(addScores(100,80),2));
    }
}
