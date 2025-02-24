package chapter06_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            별찍기를 통한 for 문 구조 학습
            *
            **
            ***
            ****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("? >>> ");
        int a = scanner.nextInt();
        for(int x=a;x>0;x--){
            System.out.print(" ");
        for(int y=x;y>0;y--) {
            System.out.print("*");
        }
            System.out.print("\n");
        }
    }
}