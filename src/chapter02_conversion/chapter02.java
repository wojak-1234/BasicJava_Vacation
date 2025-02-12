package chapter02_conversion;

public class chapter02 {
    public static void main(String[] args) {
        /*
        Conversion : 용량 상의 문제로 일어나는 이슈를 해결하기 위해 사용.

        1) 업캐스팅(upcasting) : 더 큰 용량의 자료형으로 변환 시키는 것.
         */
//        char asdf = 'A';
//        System.out.println("원형 :"+ asdf);
//        // 업캐스팅의 방법 # 1
//        // 형 변환을 하기 위해서는 '(바꿀자료형) 변수명'으로 작성하시면 됩니다.
//        System.out.println("변형 : "+(int)asdf);
//        System.out.println("원형 : ");
//        // 업캐스팅의 방법 # 2
//        char cast='b';
//        int cast2 =(int)cast;
//        System.out.println("원형 : "+ cast);
//        System.out.println("변형 : "+ cast2);

        // 2) downcasting : 더 적은 용량의 자료형으로 변환시키는 것
        int aa = 99; // 1번 방법 사용하세요
        int aaa = 111; // 2번 방법 사용하세요

        // 지시 사항 : 다운 캐스팅 하는 방법을 업캐스팅 방식 1,2 char 출력
        System.out.println("원형 : "+aa);
        System.out.println("변형 : "+(char)aa);
        char aaa1=(char)aaa;
        System.out.println("원형 : "+aaa);
        System.out.println("변형 : "+aaa1);
        /*
            upcasting 의 경우 메모리 용량이 커지기만 하는 것이기 때문에 암시적(implicit)으로 변형 가능
            downcasting의 경우 메모리 용량이 작아지기 때문에 메모리 용량을 벗어나게 되는 경우가 있습니다.
                ex ) long으로만 표현 가능한데 int 로 다운캐스팅 시도할 경우 오류 발생 가능성이 있다.
                그렇게 때문에 downcasting 을 할때는 explicit 으로만 합니다.
         */
    }
}
