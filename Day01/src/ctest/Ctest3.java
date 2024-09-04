package ctest;



    public class Ctest3 {
        //임의의 양의정수 n에 대해,
        //n이 어떤 양의 정수 x의 제곱인지 아닌지를 판단.
        //n이 양의정수 x의 제곱이라면 x+1의 제곱을 리턴
        //아니라면, -1을 리턴

        public static long solution(long n) {
            long result = 0;
            for (int i = 1; i*i <= n; i++) {
                long num = i * i;
                if (num == n) {
                    result = (i + 1) * (i + 1);
                } else {
                    result = -1;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            //n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수 solution을 완성.


            long result = solution(121);
            System.out.println(result);
        }
    }










