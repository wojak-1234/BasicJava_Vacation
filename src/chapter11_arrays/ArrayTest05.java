package chapter11_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
    현재까지 배운 대부분의 Java 클래스

     Scanner
     Arrays
     Integer
     Double
     Comparator
     String
     Random


    지시 사항 :

    1. index 가 10개인 number 배열을 만들거 Math.random()을 활용하여 집어넣으시오
            : 1 이상 10 이사의 int 배열로 만들어서.
    Math.random
    2. 배열 전체 출력
    3. 각 요소를 한줄에 출력
    4. 해당 배열의 합의 크기를 구할 것
    5. 짝수만 출력해서 합을 구할 것
    6. 오름차순
    7. 내림차순 출럭
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        Double a = Math.random();       // 0.0 초과 1.0 미만의 난수를 생성해서 반환
        System.out.println(a);
        int add=0;
        int [] numbers = new int [10];
        for (int i=0;i<numbers.length;i++) {
            numbers[i] = (int)((Math.random()*10)+1);
        }
            System.out.println(numbers.toString());
        for (int i : numbers) {
            System.out.print(numbers[i]*10 + " ");
        }
        for (int i : numbers) {
        if(i%2==0)
        {
            System.out.println(i);
            add+=i;
        }
            System.out.println(add);
        Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
            for(int j=numbers.length-1;j>=0;j--)
            {
                System.out.print(numbers[j]);
            }
        }
    }
}