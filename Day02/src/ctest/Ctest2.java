package ctest;

public class Ctest2 {
    //자연수 n이 주어지면 n의 각 자릿수의 합을 구해서 return하는 함수.
    public static long solution(long n ) {
        long answer = 0;
        while(n>0){
            answer += n%10;//일의 자리부터 차례대로 더한다.
            n/=10;//다음 자릿수를 더하기위한 n을 세팅

        }
        return answer;



    }
    public static void main(String[] args) {

        long result = solution(123);
        System.out.println(result);
    }
}
