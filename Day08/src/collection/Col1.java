package collection;

import java.util.*;

public class Col1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Set<Integer> set = new HashSet<Integer>();
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);

        Map<String,Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map);
        System.out.println(map.get("a")+19);
        //a라는 key값의 value를 출력.

    }
}
