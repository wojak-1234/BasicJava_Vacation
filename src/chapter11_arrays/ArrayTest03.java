package chapter11_arrays;
/*
    향상된 for문(Enhanced for loop)

    일반 for 문과의 차이점 :
        일반  for 문의 경우 인덱스 넘버를 명확하게 알고 있어야 하지만
        일일이 element 의 숫자를 세는것이 번거롭기 때문에
        arr01.length와 같은 방식으로 int 값을 추출해서 대입했다

        그런데 잘 생각해보면 for할때의 int i는
        for 문 내부에서 정의함

        이를 응용하여 배열 내의 element를 변수에 대입해버리는 방식으로
        index 넘버의 사용 없이 적용할 수 있는 for 반복문에 해당.

    제약 :
        읽기 o 쓰기 x

    형식 :
        for( 자료형 변수명 : 반복가능객체(배열) ){
            실행문
            }
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        /*
            for statement with no enhancement

        for (int i = 0; i < arr01.length; i++){
            System.out.print(arr01[i]+" ");
        }
         */
        for (int j : arr01) {
            System.out.print(j + " ");
        }
        // 이상을 이유롷 배열의 경우 복수형 변수를 사용합니다.
        String[] names = {"John", "Jane", "Jack", "Bob"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
