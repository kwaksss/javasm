package control;

public class Control3 {
    public static void main(String[] args) {
        //1~10까지 합과 평균을 구하시오.
        //while문으로..

        int sum = 0;
        double average = 0.0;
        int cnt = 0;

        int num = 1;
        while(num <= 10){
            if(num %2 == 0){


                sum += num;
                cnt ++;

            }
            ++num;

        }

        average = sum *1.0 /cnt;
        System.out.printf("%d, %5.2f, %d" , sum , average, cnt);
    }
}
