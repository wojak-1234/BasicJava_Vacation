package chapter06_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for (int i = a-1; i > 0; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
