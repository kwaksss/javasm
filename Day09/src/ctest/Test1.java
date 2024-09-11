package ctest;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public  static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();//숫자를 넣을 ArrayList 선언.
        list.add(0);
        list.add(1);


        for (int i = 2; i <= n + 1; i++) { //n번째면 n개의 숫자 필요.
            int a = list.get(i-1) + list.get(i-2);
            list.add(a);



        }
        answer = list.get(n);
        answer = answer % 1234567;
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(6));


    }
}
