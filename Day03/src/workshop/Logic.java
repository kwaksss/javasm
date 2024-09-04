package workshop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Logic  {

    int totalPrize; // 100억 ~ 300억 사이의 금액 (단위: 억)
    int firstPrize ;
    int secondPrize  ;
    int thirdPrize  ;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 40;
    private static final int NUM_COUNT = 5;
    private int[] numbers;
    private MyLotto myLotto;


    public Logic(MyLotto myLotto) {
        this.myLotto = myLotto;
        make();
        generatePrizes();
    }

    private void generatePrizes() {
        Random random = new Random();
        totalPrize = random.nextInt(201) + 100; // 100억 ~ 300억 사이의 금액 (단위: 억)
        firstPrize = totalPrize * 75 / 100;
        secondPrize = totalPrize * 24 / 100;
        thirdPrize = totalPrize * 1 / 100;
    }

    public void make() {
        Random rand = new Random();
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < NUM_COUNT) {
            numberSet.add(rand.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
        }
        numbers = numberSet.stream().mapToInt(Integer::intValue).toArray();
    }
    public void result(){
        int[] myNumbers = myLotto.getMyLotto();
        int[] numbersArray = numbers ;
        int count = 0;

        for(int myNumber : myNumbers){
            for(int number : numbersArray){
                if(myNumber == number){
                    count++;
                }
            }
        }
        System.out.printf("이번주 로또번호 추첨: %s 입니다.\n", Arrays.toString(numbers));
        System.out.printf("총 상금은 %d 억 원입니다.\n", totalPrize);
        System.out.printf("로또번호 %d개를 맞추셨습니다.\n", count);

    }





    public int[] getNumbers() {
        return numbers;
    }
    public String toString(){
        return String.format("[%d] [%d] [%d] [%d] [%d]", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
    }
}



