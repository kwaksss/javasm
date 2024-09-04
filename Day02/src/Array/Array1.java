package Array;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int a[] = new int[3];//new를 써서 a는 참조 타입이 됐다.
        Random rand = new Random();
        for(int i=0;i<a.length;i++){
            a[i] = rand.nextInt(100) + 1;//1~100


        }
        System.out.println(a);
        //a의 주솟값이 찍힌다.
        //배열 안의 값이 여러개 이므로 toString으로 못쓴다.

        //Solution
        System.out.println(Arrays.toString(a));
        //reference a를 넣어준걸 toString으로

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        for(int n:a){
            System.out.println(n);

        }//for(데이터 타입:데이터 묶음){}


    }
}
