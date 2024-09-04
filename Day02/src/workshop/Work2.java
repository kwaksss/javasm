package workshop;

import java.util.Random;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {

//        1. 팀별 게임 룰을 정한다.(5 / 40) 확률 높이기 위해
//
//        2. 게임을 시작 하면 랜덤하게 상금이 만들어 진다. 70 20 10
//
//        3. 게임을 시작 하면 랜덤하게 당첨번호가 만들어 진다. O
//
//        4. 사용자가 번호를 입력 하고 당첨 여부를 확인 하다. O
//
//        5. 등수에 따라 당첨금을 부여 한다.


        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];//당첨번호
        int b[] = new int[5];//나의 번호.
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }//입력받은 숫자 배열에 저장.

        for (int i = 0; i < a.length; i++) {//배열 길이 만큼 반복
            a[i] = rand.nextInt(40) + 1; //1~40
            for (int j = 0; j < i; j++) {//배열 값 채워가면서 모든 인덱스끼리 값 비교.
                if (a[j] == a[i]) {//값이 같으면,
                    i--;
                    break;

                }

            }//40개중 중복 없이 5개 뽑음


        }
    }
}
