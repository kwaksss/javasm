package ctest;

import java.util.Scanner;

public class Ctest1 {
    public static void main(String[] args) {

        //정수 x와 자연수 n을 입력받는다.
        //x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
        Scanner sc = new Scanner(System.in);
        System.out.println("x:");
        long x = sc.nextLong();
        System.out.println("n:");
        int n = sc.nextInt();
        long a[] = new long[n];
        //x와 n을 입력받음.

        for(int i = 0; i < n; i++){
            a[i] = x * (i+1);
        }

        for(long b: a){
            System.out.println(b);
        }


//        public long[] solution(int x, int n) {
//            long[] answer = new long[n];
//            for (int i = 1; i <= n; i++) {
//                answer[i-1] = (long) x * i;
//            }
//            return answer;
//        }




    }
}
