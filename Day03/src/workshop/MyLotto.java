package workshop;


import java.util.Scanner;
import java.util.Set;

public class MyLotto {
    //나의 로또번호를 중복없이 입력함.


    private int[] myLotto;//내가 입력한 로또번호 index

    Scanner sc = new Scanner(System.in);




    public MyLotto() {
        myLotto = new int[5];
        mylotto();


    }



    private void mylotto(){
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + "번쨰 로또 번호 입력 : ");
            myLotto[i] = sc.nextInt();
            if (myLotto[i] < 1 || myLotto[i] > 40) {
                System.out.println("로또번호는 1에서 40까지 입니다.");
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (myLotto[i] == myLotto[j]) {
                    System.out.println(" 로또번호는 중복될수 없습니다.");
                    i--;
                    break;
                }
            }
        }



    }

    public int[] getMyLotto() {
        return myLotto;
    }
}
