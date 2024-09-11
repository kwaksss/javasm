package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Col2 {
    public static void main(String[] args) {

        //1부터 45가지 에서 6개의 숫자를 중복되지 않게 추출 하시오.
        //Set을 이용하시오.
        Random rand = new Random();
        Set<Integer> set = new HashSet<Integer>();
        while(set.size() < 6) {
            set.add(rand.nextInt(45)+1);
        }
        //for 문을 활용한 중복x 로직 기억.

        System.out.println(set);


    }


}
