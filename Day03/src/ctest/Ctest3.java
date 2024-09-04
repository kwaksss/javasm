package ctest;

public class Ctest3 {
    //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때,
    //k번째 있는 수를 구하려합니다.
    //ex) array = [1,5,2,6,3,7,4] i = 2, j=5,k=3
    // array의 2번째 부터 5번째까지 자르면 [5,2,6,3]
    //위 배열을 정리하면 [2,3,5,6](내림차순.)
    //3번째 숫자는 5를 출력하도록..
    public static int[] solution(int[] array, int[][] commmands){
        int[] answer = {};
        System.arraycopy(array,i);

        return answer;

    }


    public static void main(String[] args) {
        int a[] = {1,5,2,6,3,7,4};
        int b[][] = {{2,5,3},{4,4,1},{1,7,3}};//차례대로 i,j,k
        System.out.println(solution(a,b));

    }
}
