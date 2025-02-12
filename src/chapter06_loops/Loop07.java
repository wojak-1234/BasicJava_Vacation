package chapter06_loops;

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0;
        boolean isEmpty = true;

        while (isEmpty) {

            System.out.print("n에 들어갈 값? >>> ");
            n = scan.nextInt();
            if(n==0)
            {
                isEmpty=false;
            }

            System.out.println("n의 값"+n);
        }
        /*

        이상의 while 반복문에서 확인할 수 있는점:
            break; 명령어와 isEmpty 변수는 반복문을 종료시켜준다는 공통점이 있음.
            하지만, 작동 방식이 다릅니다.

            1)break:
            : break;가 실행되는 즉시 while 반복문이 종료되어 break; 밑에 있는 코드들을 실행시키지 않고 종료

            2) isEmpty
            : 변수의 데이터는 true->false / false->true로 바뀌었지만,
            while 조건식을 적용하는 시점까지 나머지 반복실행문을 전부 실행시키고
            조건을 검토하는 단계에서 전체 반복문 종료
         */
    }
}
