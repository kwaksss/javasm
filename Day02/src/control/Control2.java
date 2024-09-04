package control;

public class Control2 {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        double average = 0.0;
        int cnt = 0;
        //1~10까지의 합과 평균을 구하시오

        for (int i = 1; i<=10; i++){
            sum += i;
            cnt ++;

        }
        average = sum *1.0 /cnt; //이건 정수/실수라 안됨.
        //sum/cnt *1.0은 정수/실수 후에 *1.0을 하는거라 의미x
        System.out.printf("%d, %5.2f, %d" , sum , average, cnt);


        //for

    }
}
