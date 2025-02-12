package BAEKJOON;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int k=0;k<a;k++){
            for(int p=1;p<k+1;p++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
