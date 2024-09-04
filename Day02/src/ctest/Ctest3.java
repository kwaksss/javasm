package ctest;

public class Ctest3 {
    //입력된수가 짝수라면 2로나눈다.
    //입력된수가 홀수라면 3을 곱하고 1을 더한다.
    //결과로나온 수에 같은 작업을 1이 될때까지 반복한다.
    public static int solution(int n){
        int answer = 0;

        while(n != 1){
            if(n == 0){
                System.out.println("0을 제외한 나머지 입력");
            }
            else if(n % 2 == 0){//짝수라면,
                n = n/2;

                }

            } else { //홀수라면
                n = n*3+1;

                }


            }
        }
        return ;
    }
    public static void main(String[] args) {
        int result = solution(6);
        System.out.println(result);
    }
}
