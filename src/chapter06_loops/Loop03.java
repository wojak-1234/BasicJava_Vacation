package chapter06_loops;
/*
중첩 for 문
 */
public class Loop03 {
    public static void main(String[] args) {
        int a,b;
//for(int i=0;i<5;i++)
//{
    // a의 값 초기화
//    a=i;
//    System.out.println("a="+a);     //반복실행문 1에 해당
//    for(int j=0;j<5;j++)
//    {
//        //
//        b=j;
//        System.out.println("b="+b);     //반복실행문 2에 해당
//    }
//}
        for(int x=1;x<10;x++)
        {
            for(int k=0;k<10;k++)
            {
                System.out.println(x+" x "+ k+" = " + (x*k));
            }
        }

    }
}
