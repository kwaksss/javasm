package Array;

import java.util.Arrays;
import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int a[][] = new int[5][5];
        //1~100까지 랜덤한 숫자를 각 인덱스에 넣고
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(100)+1;

            }

        }
        //예쁘게 출력하시오.
        for(int n[] : a) {
            for (int num : n) {//배열에서 숫자를 꺼냄
                System.out.printf(num + " ");
            }
            System.out.println();
        }

    }
}
