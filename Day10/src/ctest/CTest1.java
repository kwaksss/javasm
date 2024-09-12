package ctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CTest1 {

    //수포자 삼인방.
    //모의고사 수학문제 전부 찍으려한다.
    //정답이 들어있는 배열 answer
    //가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return하도록.
    //1번:12345 12345 12345
    //2번:21232425 21232425
    //3번: 3311224455 3311224455

    public static ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);//0
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);//7
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);//0
        list3.add(3);
        list3.add(1);
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add(4);
        list3.add(4);
        list3.add(5);
        list3.add(5);//9
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 1; i < answers.length+1; i++) {
            if (answers[i-1] == i) {//1번 정답수.
                if (i >6) {
                    i = 1;
                    count1 =count1-1;
                }count1++;
            }
            if(list.get(i-1) == answers[i-1]) {
                if(i > 8){
                    i = 1;
                    count2 =count2-1;
                }count2++;
            }
            if(list3.get(i-1) == answers[i-1]) {
                if(i > 10){
                    i = 1;
                    count3 =count3-1;
                }count3++;
            }
        }
        int maxValue = Math.max(count1, Math.max(count2, count3));
        ArrayList<Integer> result = new ArrayList<>();
        if (count1 == maxValue) {
            result.add(1);
        }
        if (count2 == maxValue) {
            result.add(2);
        }
        if (count3 == maxValue) {
            result.add(3);
        }
        return result;
    }

    public static void main(String[] args) {
        int answer[] = {1,3,2,4,2};
        System.out.println(solution(answer));





    }
}
