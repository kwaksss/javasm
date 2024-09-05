package ctest;

public class ctest2 {
    public int solution(int[] a, int[] b) {
        //길이가 같은 두 1차원 정수 배열 a,b가 매개변수..
        // a와b의 내적을 return하도록..
        // a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]

        int answer = 0;
        for(int i = 0; i < a.length; i++){//a.length로 해도 a,b배열 길이가 같다고 하니 상관없을듯
            answer += a[i] * b[i];

        }


        return answer;


    }
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};


    }
}

