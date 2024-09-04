package ctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ctest1 {
    //배열 arr가 주어집니다.
    //배열 arr의 각 원소는 숫자 0부터 9까지.
    //arr에서 연속적으로 나타나는 숫자는 하나를 남기고 전부제거.
    //단, 제거된 후 남은 수들을 반환 할때는 배열 arr원소들의 순서를 유지.
    //ex) arr = [1,1,3,3,0,1,1]이면 [1,3,0,1]을 return
    //e[4,4,4,3,3]이면[4,3]

    public static List<Integer> solution(int[] n) {
        List<Integer> answer = new ArrayList<>();

        // 첫 번째 요소는 무조건 리스트에 추가
        answer.add(n[0]);

        // 두 번째 요소부터 시작하여 이전 요소와 비교
        for (int i = 1; i < n.length; i++) {
            // 이전 요소와 현재 요소가 다를 때만 리스트에 추가
            if (n[i] != n[i - 1]) {
                answer.add(n[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        int[] a = {1,2,1,2,2};
        System.out.println(solution(a));

    }
}
