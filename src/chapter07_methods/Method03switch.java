package chapter07_methods;

import javax.swing.*;
import java.util.Scanner;

public class Method03switch {
    /*
        Method02.java 파일을 확인하시면 별찍기 관련한 method 중 if statement -> switch statement
     */

    public static String getStar(int totalline, int menu) {
        String result = "";
        switch (menu) {
            case 1: {
                //왼쪽으로 치우친
                for (int i = 0; i < totalline; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            }
            case 2: {
                for (int i = 0; i < totalline; i++) {
                    for (int j = 0; j < totalline - i - 1; j++) {
                        result += " ";
                    }
                    for (int k = i + 1; k < k + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            }
            case 3: {
                for (int i = 0; i < totalline; i++) {
                    for (int j = 0; j < totalline - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            }
            case 4: {
                for (int i = 0; i < totalline; i++) {
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < totalline - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            }
            default:
            {
                System.out.println("입력 오류입니다");
            }
        }
        return result;
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice;

        System.out.println("별의 줄 수 입력하세요");
        rowOfStars = scanner.nextInt();
        String starResult;

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.println("메뉴를 숫자로 선택하세요 >>>");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars,choice);
        System.out.println(starResult);
    }
}
