package chapter07_methods;
/*
    method overloading
        매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의할 수 없다.

        즉 ,메서드 명은 동일하고 parameter에 들어가는 자료형 및 변수명을 달리 사용이 가능함

        overloading의 장점:
            동일한 기능을 하는 메서드를 정의할 때 메서드명이 필요한데,
            예를 들어 String 자료형끼리 연결해주는 메서드와
            int끼리 합 연산을 하는 메서드를 나누었을때,
            그리고 double 끼리 합 연산을 하는 메서드를 나누었을때,
            add,
            plus,
            connect
            다음 메서드는 뭘로 할 예정인가요?

            add(int a, int b)라는 메서드를 정의했을 때,
            add(1,2) 집어넣어서 3이라는 결과값을 만들고,
            add(3,3) 집어넣어서 6이라는 결과값을 만드는 방식으로
            1....n 까지의 합을 구할 수는 있습니다.

            add(int a,int b ..., int n)으로 정의한다고 할 때
            n의 개수가 고정돼있지 않으면 항상 오류가 발생한다는 문제점이 있을 겁니다.

 */
public class OverLoading {
    //call1
    public static void add(){
        System.out.println("add()");
    }
    //call2
    public static void add(String s){
        System.out.println("add(s)");
        System.out.println(s);
    }
    //call2
    public static void add(int a,int b){
        System.out.println("add(a,b)");
        System.out.println("a + b = "+(a+b));
    }
    public static void add(String s, int a)
    {
        System.out.println("add(s,a)");
        System.out.println(s +" / "+ a);
    }
    public static void add(int a, String s)
    {
        System.out.println("add(a,s)");
        System.out.println(a +" / "+ a);
    }
    public static void main(String[] args) {
        // call1 방식으로 출력
        add(1,2);
        add("안녕하세요",1234);

    }
}
