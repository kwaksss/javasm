package ctest;

public class Ctest1 {

    public static int solution(int n){
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==1){
                return i;
            }

        }



        return 0;
    }
    public static void main(String[] args) {

        //자연수 n이 매개변수로 주어집니ㅏㄷ.
        //n을 x로나눈 나머지가 1이 되도록하는 가장작은 자연수 x를 return 하도록..

        int answer = solution(10);
        System.out.println(answer);
    }
}
