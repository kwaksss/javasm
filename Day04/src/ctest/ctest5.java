package ctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ctest5 {
    //정수배열 numbers가 주어진다.
    // numbers에서 서로다른 인덱스에 있는 두개의 수를 뽑아 더해서 만들 수 있는 모든수를 배열에 오름차순으로 return

    public static int[] solution(int[] numbers) {
        int[] answer = new int[1000];
        int count = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {//두개를 뽑는 모든 경우의 수 가능.
                //
               answer[count++] = numbers[i] + numbers[j];


            }
        }
        //중복제거& 오름차순 해주면 된다.
        answer = Arrays.copyOf(answer,count);
        answer = Arrays.stream(answer).distinct().toArray();

        Arrays.sort(answer);


        return answer;
    }

    public static void main(String[] args) {

        int numbers[] = {2,1,3,4,1};
        //2+1 3
        //2+3 5
        //2+4 6
        //2+1 3
        //1+3 4
        //1+4 5
        //1+1 2
        //3+4 7
        //3+1 4
        //4+1 3
        System.out.println(solution(numbers));


    }
}
