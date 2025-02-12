package chapter07_methods;

import java.util.Scanner;
public class Method02 {
    // 메서드를 정의할 부분
    public static String getStar(int rows , int select)
    {
        // 사용할 변수 선언
        String result = "";

        // select에 따라서 서로 다른 결과값이 나오도록 조건문을 작성할 예정.

        if(select == 1)
        {
            //왼쪽으로 치우친
            for(int i=0;i<rows ; i++)
            {
                for(int j=0;j<i+1;j++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        else if(select == 2)
        {
            for(int i=0;i<rows ; i++)
            {
                for(int j=0;j<rows-i-1;j++) {
                    result += " ";
                }
                for (int k=i+1;k<k+1;k++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        else if(select == 3)
        {
            for(int i=0;i<rows ; i++)
            {
                for(int j=0;j<rows-i;j++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        else if(select == 4)
        {
            for(int i=0;i<rows ; i++)
            {
                for(int j=0;j<i;j++) {
                    result += " ";
                }
                for(int k=0;k<rows - i ; k++){
                    result += "*";
                }
                result += "\n";
            }
        }
        else {
            System.out.println("입력 오류입니다");
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

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);
    }
}
