package ctest;

public class ctest3 {

    //단어 s의 가운데 글자를 반환하는 함수를 만들어라
    //글자수가 짝수라면 가운데 두글자를 반환해라.
    public static String solution(String s) {
        String answer = "";
        int a = s.length();//문자열의 길이.
        if(a%2 == 0){ //짝수이면
            int b = a/2-1;
            int c = (a/2);

            answer = answer.concat(String.valueOf(s.charAt(b))) ;
            answer = answer.concat(String.valueOf(s.charAt(c)));

        }
        else {
            int d = a/2;
            answer = answer.concat(String.valueOf(s.charAt(d)));
        }

        return answer;
    }


    public static void main(String[] args) {

        String a = "abcde";
        String b = "qwer";
        String c = solution(a);
        String d = solution(b);


        System.out.println(solution(a));


    }
}
