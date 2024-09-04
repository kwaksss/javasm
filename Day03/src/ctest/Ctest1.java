package ctest;

public class Ctest1 {
    //배열 arr가 주어집니다.
    //배열 arr의 각 원소는 숫자 0부터 9까지.
    //arr에서 연속적으로 나타나는 숫자는 하나를 남기고 전부제거.
    //단, 제거된 후 남은 수들을 반환 할때는 배열 arr원소들의 순서를 유지.
    //ex) arr = [1,1,3,3,0,1,1]이면 [1,3,0,1]을 return
    //e[4,4,4,3,3]이면[4,3]

    public static int[] solution(int[] n){
        int answer = 0;
        //[i-1] = [i]이면 [i]삭제 이렇게 반복,
        //아니면 건너뜀..
        for(int i =0;i<n.length;i++ ){//배열 n의 길이만큼 반복
            if(n[i] == n[i+1]){


            }

        }




        return 0;
    }
    public static void main(String[] args) {

    }
}
