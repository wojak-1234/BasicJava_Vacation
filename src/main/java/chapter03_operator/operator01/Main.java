package chapter03_operator.operator01;
/*
    논리 연산자

    true(1) , false(0) : 컴퓨터가 읽을 수 있는 두 숫자

    AND(&&) : 곱 T x T = t / T x F = F / F x F = F -> 하나라도 false라면 false
    OR(||) : 합 연산자라고도 함 T + T = T / T + F = T / F + F = F -> 하나라도 True라면 True
    NOT(!) : 값을 반대로 바꿔준다. 혹은 틀릴 경우를 나타냄
 */
public class Main {
    public static void main(String[] args) {
    boolean flag = true;
    boolean flag2 = false;

    boolean result = flag && flag2;
    System.out.println(result);
    boolean result2 = 10%3==0;
    System.out.println(result2);
    }
}
