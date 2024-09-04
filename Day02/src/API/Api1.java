package API;

import java.util.Random;//랜덤하게 숫자를 발생시키는 api
import java.util.Scanner;

public class Api1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = 0;//number가 try안에 갇혀있어서 만들어줌.
        try {
             number = sc.nextInt();
            // 10 line에서 멈춰있는다.
            // 프로그램 아직 끝 x
            // 쓰레드 멈춰있음.
        }catch (Exception e){
            System.out.println("Invalid number..Try again.");
            sc.close();//close를 안하면 예외가 발생했을때 return 때문에 아래 코드가 무시되므로 close를 먼저 해준다.
            return;//예외가 발생한 경우 실행되면 안되기때문에 함수 끝냄.
        }

        Random rand = new Random();
        int num = rand.nextInt(number);//0~9까지 랜덤 숫자.
        //int num = rand.nextInt(10)+1;은 1~10까지.
        System.out.println(num);
        sc.close();
        //SYtem으로 연것은 반드시 닫아준다.
    }

}
