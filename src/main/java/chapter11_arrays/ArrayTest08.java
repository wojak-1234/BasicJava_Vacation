package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;
/*
    로또 번호 추첨기를 프로그래밍할 예정

    1. 1부터 45까지의 숫자를 임의로 생성한 후, lotoNumbers라는 배열에 저장할 예정
    2. 2차 배열을 만들 예정인데, 5번의 게임 진행
        - 6개의 번호 뽑는 것을 5게임 할 예정입니다.
    3. nextInt()를 통해서 번호를 뽑게 되면 중복 번호가 생길 수 있습니다.
        -> getter / setter 와 같은 파트에서 중복 제거와 관련된 로직을 확인 가능
    4. 배열 완성 후 오름차순을 통해서 숫자정렬후 출력

    실행 예
    이번 로또 당첨 번호는 다음과 같습니다
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] lotoNumbers = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                int newNumber;
                boolean isDuplicate;
                do {
                    newNumber = random.nextInt(45) + 1;
                    isDuplicate = false;
                    for (int k = 0; k < j; k++) {
                        if (lotoNumbers[i][k] == newNumber) {
                            isDuplicate = true;
                            break;
                        }   //boolean 변수가 true 라면 다시 난수 대입.
                    }
                } while (isDuplicate);
                lotoNumbers[i][j] = newNumber;
            }
            Arrays.sort(lotoNumbers[i]);
            System.out.println(Arrays.toString(lotoNumbers[i]));
        }
    }
}
