package ctest;

public class ctest1 {
    //놀이기구 원래 이용료는 price원
    //놀이기구 N번 이용한다면 원래 이용료의 N배를 받는다.
    //ex) 처음 100
    //두번째 200
    //세번째 300
    //count번 타게되면 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return
    //금액이 부족하지 않으면 0을 return

    public static long solution(int price,int money,int count){

        long answer = -1;
        long sum = 0;
        long price1 = 0;
        for(int i=0;i<count;i++){//count만큼 반복.
            price1  = price * (i+1);
            //횟수마다 price n배씩됨.
            //1. price = 3
            //2. price = 6
            sum += price1;
            //1.sum = 3

        }
        answer = sum - money;




        return answer;

    }
    public static void main(String[] args) {

        long a = solution(3,20,4);
        //4번 반복
        System.out.println(a);


    }
}
