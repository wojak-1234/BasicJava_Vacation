package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    강사버전 참조하고 가장 상위의 for 문을 while 형태로 변환하고 정상적으로 작동하는지 확인
 */
public class ArrayTest08_While {
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
                        }
                    }
                } while (isDuplicate);             //totalGame --
                lotoNumbers[i][j] = newNumber;
            }
            Arrays.sort(lotoNumbers[i]);
            System.out.println(Arrays.toString(lotoNumbers[i]));
        }
    }
}
