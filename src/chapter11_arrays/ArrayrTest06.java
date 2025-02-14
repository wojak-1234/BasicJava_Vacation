package chapter11_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi Dimensional Array) 중 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미하지만. 개발 환경 상
    2차원 배열 이상을 사용하는 경우가 극히 드물기 때문에, 2차원 배열을
    기주으로 강의합니다.

    형식 :

    int [][] arr01 = new int [sizeof][sizeof];
    int [][] = new int [sizeof][];
    int [][] arr03 = {{},{},{}};

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야함.
        -> 2번 방식을 참조
        1열 2열
       {1  , 2}     -1행
       {3  , 4}     -2행
       {5  , 6}     -3행

       가로줄  : 행
       세로줄  : 열
 */
public class ArrayrTest06 {
    public static void main(String[] args) {
        int[][] arr03 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(arr03);
        System.out.println(Arrays.toString(arr03));
        // 이상태로 출력하면 밑의 출력코드에선 주소값만 3개 나옴
        // -> 그래서 새로운 방식이 필요함.1\
//        for (int i = 0; i < arr03.length; i++) {
//            for (int j = 0; j < arr03[i].length; j++) {
//                System.out.print(arr03[i][j]);
//            }
//        }
//        for (int[] i : arr03)
//        {
//            for(int k: i)
//            {
//                System.out.println(k);
//            }
//        }
        int [][] arr02 = {{1,2,3},{4,5,6},{7,8,9}}; // 해당 배열의 크기는 [3][3]
        //변수 선언 및 초기화니까 {};세미콜론이 붙었습니다.

    }
}
