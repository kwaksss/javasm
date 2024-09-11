package ctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    //각 부서가 신청한 금액만큼을 모두 지원해야한다.
    //ex)1000원을 신청했으면 정확히 1000원
    //부서별 신청한 금액이 들어있는 배열 d
    //예산 budget이 매개변수로 주어질때,
    //최대 몇개의 부서에 물품 지원 할 수 있는지 return.
    //가격이 적은걸 우선순위로. -> 오름차순으로 정렬후, 0부터...꺼내면된다.

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int num : d) {
            integerList.add(num);
        }
        Collections.sort(integerList);//오름차순으로 정렬.

        for (int num : integerList) {


                if (budget >= num) {
                    budget -= num;
                    count = count + 1;

                }
                else{
                    break;

                }
            }
        answer = count;



        return answer;
    }

    public static void main(String[] args) {

        int d[] = {2,2,3,3};

        System.out.println(solution(d,10));


    }
}
