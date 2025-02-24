package chapter11_arrays;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력

    이전 수업에서 sout(arr)을 이용하여 출력하게 되면 배열은 참조 변수이기 때문에
    주소값만 출력된다는것을 확인했습니다. 그리고 반복문을 통해서 element르 불러올 수는 있지만
    배열 전체를 출력하는 방법은 이제 수업에서 배우게 됩니다.

    Arrays 클래스를 사용하고, 정적 메섣 . toString(배열명)을 사용하면 배열 전체를 출력할 수 있습니다.
    클래스명.메서드명이라는 점에 주목해야합니다. -> scanner.next와 좀 차이가 있는 상황
    toString이라는 메서드도 추후에 사용예정.

    동일한 method 명이라고 하더라도 어떤 클래스에 종속돼있는가에따라 다른 결과값을 가질 수 있다.

 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int number = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(number);
//        System.out.println("Enter an integer: ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.println((i+1)+" ");
        }

        //enhanced for loop 을 이용해서 출력

        for(int i : arr)
        {
            System.out.print(i+" ");

        }
        //배열 전체 출력 방법
        System.out.println(Arrays.toString(arr));

        Integer[] arr02 = {1,2,3,1,4,2,3,4,6,4};
        System.out.println("정렬 전 배열" + Arrays.toString(arr02));
        // 오름 차순 정렬 배열
        Arrays.sort(arr02);     // 대부분의 경우 메서드를 사용하고 나면 그것을 볁수에
                                // 대입해왔지만 sort의 경우 arr02자체를 갈고 다시 정의한다. (인덱스 넘버에 따른 결과도 달라짐.)
        System.out.println(Arrays.toString(arr02));

        // 내림차순 배열
        Arrays.sort(arr02, Comparator.reverseOrder());
        // 오름 차순 시에 사용했던 sort와 마찬가지로 배열자체 순서를 전부 바꿉니다.
        System.out.println("내림 차순 배열 : "+Arrays.toString(arr02));
        // Comparator.reverseOrder() 메서드를 적용하기 위해서는 아까 빨간줄 떴을때  T[]라는 게
        // 있었는데, 추후에 배우게 될 제너릭이라는 개념입니다.
        //t에 해당되는것은 기본 자료형은 불가능하고, 클래서여야만 하기 때문에
        // int라는 기본 자료형으로 만들어진arr02는 오류가 발생하여,
        // Ingetar로 교체하였습니다.
        // ++ 기본 자료형을 모아둔 클래스가 있다 ex(Integar , Double , saTRING)
    }
}
