package ctest;

public class ctest4 {
    //네오와 프로도 숫자 놀이 하고있다.
    //네오가 프로도에게 숫자를 건넬때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임.
    //1478 → "one4seveneight"
    //234567 → "23four5six7"
    //10203 → "1zerotwozero3"

    public static int solution(String s) {
        int answer = 0;
        int cnt = 0;



            String a = s.replaceAll("zero","0");
            String b = a.replaceAll("one","1");
            String c = b.replaceAll("two","2");
            String d = c.replaceAll("three","3");
            String e = d.replaceAll("four","4");
            String f = e.replaceAll("five","5");
            String g = f.replaceAll("six","6");
            String h = g.replaceAll("seven","7");
            String i = h.replaceAll("eight","8");
            String result = i.replaceAll("nine","9");


        answer = Integer.parseInt(result);


        return answer;
    }
    public static void main(String[] args) {

        String s = "one4seveneight";
        int a = s.length();
        System.out.println(solution(s));


    }
}
