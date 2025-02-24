package chapter06_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {

        /*
            n 에 숫자를 입력하여 몇 번 반복할지 결정하고
            1부터 n 까지 표시하는 반복문을 작성하시요
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=0;
        for(int p=0;p<n;p++) {
            System.out.println((p+1) + " ");
            k+=p+1;
        }
        System.out.println(k);
    }
}
