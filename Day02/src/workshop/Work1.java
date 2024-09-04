package workshop;

import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        //int형 1차원 배열 5개에 중복 되지 않게
        //1~10까지 난수를 입력한다.
        //단 중복 되지 않게 입력한다.
        //입력된 배열에서 최대 값과 최소 값을 출력 하시오.
        int max = 0;
        int min = 10;

        Random random = new Random();
        int a[] = new int[5];//5칸짜리 배열 선언
        for(int i=0; i<a.length; i++) {//배열 길이 만큼 반복
            a[i] = random.nextInt(10) + 1;
            for(int j = 0; j<i; j++){//배열 값 채워가면서 모든 인덱스끼리 값 비교.
                if(a[j] == a[i]){//값이 같으면,
                    i--;
                    break;

                }

            }
            if(a[i]> max){
                max = a[i];


            }
            else if (a[i] <= min) {
                min =  a[i];

            }



        }
        for(int n: a){
            System.out.println(n);

        }
        System.out.printf("최대:%d, 최소:%d\n", max,min);


    }
}
