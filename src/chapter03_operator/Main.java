package chapter03_operator;

public class Main {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i=10;
        System.out.println(i);
        // 대입 연산자 - "=" : 오른쪽의 데이터를 왼쪽의 변수에 대입하겠다는 의미.
        i = i+1;        // 변수명 i에 10(기존 i 에 대입되었던 데이터) + 1해서 재대입.
        System.out.println(i);

        int j=10;
        System.out.println(j);
        System.out.println(j++);            // 출력값 : 10 변수명 ++ : 크드를 실행시킨 후에 J 에 1을 더할것
        System.out.println(j);              // 출력값 : 11
        System.out.println(++j);            // 출력값 : 12 ++변수명  : 코드를 실행시키기 '전'에 J 에 1을 더할것

        /*
            일반 수식 연산자
            +  : 더하기
            /// (c++이랑 똑같음)
         */
    }
}
