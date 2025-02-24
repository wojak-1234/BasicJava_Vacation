package chapter05_condition;

import java.util.Scanner;

/*
    switch 문

    형식 :
    switch(변수)
        case 조건1:
        break;
        case 조건2:
        break;
        case 조건3:
        break;
        case 조건4:
        break;
        default;
        실행문 5

        default 의 의미 : case 에 해당되지 않는 변수가 적용되었을 경우 실행되는 부분
        break 의 의미 : 멈추
 */
public class Condition05Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected2 = null;
        System.out.println("메뉴를 선택하세요 >>> ");
//        System.out.println("[선택 프로그램]");
//        selected = scanner.nextLine();
//        System.out.println("a. 메뉴1");
//        System.out.println("b. 메뉴2");
//        System.out.println("c. 메뉴3");
//        System.out.println("d. 메뉴4");
//        System.out.println("e. 메뉴5");

                //selected 2 를 기준으로 한 프로그램
        System.out.println("[선택 프로그램]");
        selected2 = scanner.nextLine();
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
switch (selected2) {

//    case 1:
//        System.out.println("menu1");
//        break;
//        case 2:
//        System.out.println("menu2");
//        break;
//        case 3:
//        System.out.println("menu3");
//        break;
//        case 4:
//        System.out.println("menu4");
//        break;
//        case 5:
//        System.out.println("menu5");
//        break;
//        default:
//        System.out.println("not in menu");
}
//        switch (selected)
//        {
//            case "a":
//            System.out.println("menu 1");
//            break;
//            case "b":
//            System.out.println("menu 2");
//                break;
//            case "c":
//            System.out.println("menu 3");
//                break;
//            case "d":
//            System.out.println("menu 4");
//                break;
//            case "e":
//            System.out.println("menu 5");
//                break;
//            default:
//                System.out.println("Wrong option!");
//        }


    }
}
