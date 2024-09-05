package ctest;

import java.util.Arrays;

public class Ctest3 {
    //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때,
    //k번째 있는 수를 구하려합니다.
    //ex) array = [1,5,2,6,3,7,4] i = 2, j=5,k=3
    // array의 2번째 부터 5번째까지 자르면 [5,2,6,3]
    //위 배열을 정리하면 [2,3,5,6](내림차순.)
    //3번째 숫자는 5를 출력하도록..
    public static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int[] result = {};
        for(int a = 0; a < commands.length; a++){
            for(int b = 0; b < commands[a].length; b++){
                //1.commands[0][0]일때 i
                //2.commands[0][1]일때 j
                //3.commands[0][2]일때 k
                int i = commands[a][0];//2
                int j = commands[a][1];//5
                int k = commands[a][2];//3

                System.arraycopy(array,i-1,answer,0,j-i+1);
                Arrays.sort(answer);//오름차순 정리
                int value = answer[k-1];
                result[b] = value;





            }
        }


        return result;

    }


    public static void main(String[] args) {
        int array[] = {1,5,2,6,3,7,4};
        int commands[][] = {{2,5,3},{4,4,1},{1,7,3}};//차례대로 i,j,k
        //0의 0번째부터~2의 2번째까지...
        //반복문 2개 필요.

        System.out.println(Arrays.toString(solution(array, commands)));


    }
}
