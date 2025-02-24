package chapter11_arrays;
/*
    배열의 필요성:
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면  int 변수형
        10개 선언해서 저장해야 합니다.
        배열은 같은 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.
            -> 추후 다른 자료들을 하나의 변수에 저장하는 방식도 수업 할 예정.

        일반 변수 : 데이터를 직접 가지는 변수
            byte , short , int , double 등 기본 데이터 타입(자료형)(primitive type)을 가지는 경우
        참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나
            변경하는 경우(클래스), Collections -> Collections 는 추후 수업 예정.

 */
public class ArrayTest01 {
    public static void main(String[] args) {

    int[] arr1 = new int[10];       // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
    int[] arr2 = {1,2,3,4,5};       // 배열 선언 방식 2 -> 배열 선언 및 초기화

    // 문자열 데이터를 변수에 저장하는 방법
        String strExample = "안녕하세요";
        String strExample1 = new String("안녕하세요");
        //사실은 String 은 class 이다. -> Primitive Data Type 아니다
    if (strExample == "안녕하세요")
    {
        System.out.println("실행 1");
    }
    if(strExample1 == "안녕하세요")
    {
        System.out.println("실행 2");
    }

    // 그래서 문자열을 비교할 떄는
        if(strExample1.equals("안녕하세요")){        // equals 메서드는 주소지 값을 참조하지않고 값만 비교한다.
            System.out.println("실행 3");
        }

        // 참조 변수의 예시라고 할 수 있겠습니다.

        int[] arr03 = {1,2,3,4,5};

        System.out.println(arr03[0]);
        System.out.println(arr03[1]);
        System.out.println(arr03[2]);
        System.out.println(arr03[3]);
        System.out.println(arr03[4]);

        int[] arr04 = {10,9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < arr04.length; i++)
            System.out.println(arr04[i]);

        for(int i=arr04.length-1; i>=0; i--)
            System.out.println(arr04[i]);

        // 3번 과제에서 확인할 수 있듯이 각 element 들은 자료형에 따라 수학적인 연산 혹은
        // 기타 다른 작업을 수행 할 수 있습니다.

    }
}
