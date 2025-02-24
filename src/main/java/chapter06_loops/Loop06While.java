package chapter06_loops;
/*
while의 주의점 : while 뒤에 나오는 조건이 참일때만 반복 실행된다.
 */
public class Loop06While {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++) {
            for(int j=1;j<=10;j++) {
                System.out.print((i*10)+j+" ");
            }
            System.out.println(" ");
        }
    }
}
/*
그래서 for 문을 쓸 때와 달리 while문을 작성할 때의 유의점으로는
    for 문은 한계값을 for 문에 작성하지만,
    while 문은 그렇지 않기 때문에
    특정 시점에 조건식이 false 가 되게끔 개발자가
    사전에 염두할 필요성이 있음.
 */