package ctest;



public class Ctest2 {

    public static int solution (int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {//입력받은 n보다 작은 숫자 반복
            if (n % i == 0) {
                result += i;

            }


        }

        return result;
    }

    public static void main(String[] args) {
        //n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수 solution을 완성.



        int result = solution(12);
        System.out.println(result);









        }
    }

