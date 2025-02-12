package chapter06_loops;

public class Loop01FOR {
    public static void main(String[] args) {

        /*
        반복문 :
            1) 일반 for 문
            2) 향상된 for 문
            while 반복문
         */
        /*
            for 반북문
                : 대부분의 경우에는 명확학 횟수가 고정되어 있을 때 사용함.


                형식:
                for(시작값 ; 종료값 ; 증감값)
                반복실행문

         */
    int sum=0;
    for(int x=1; x<=101;x++)
    {
        sum+=x;
    }
    System.out.println("1부터 100까지의 합 ="+sum);
    }
}
