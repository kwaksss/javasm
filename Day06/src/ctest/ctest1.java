package ctest;

public class ctest1 {
    //")""("로만 이루어진 문자열 s
    //s가 올바른 괄호이면 true 아니면 false를 return하는 함수.
    // (과 )의 개수가 같고, )로 끝나면 true인가?

   static boolean solution(String s) {
        boolean answer = true;
        int leng = s.length();//->4
        int leng2 = s.replace("(","").length();//->(를 공백으로 대체하고 문자열 길이.
        int leng3 = leng - leng2;
        int leng4 = leng/2;

       //문자열 길이만큼 반복.
            char a = s.charAt(s.length()-1);
            if(leng3 == leng4){
                if(a == ')'){
                    answer = true;


                }
                else{
                    answer = false;
                }
            }
            else{
                answer = false;
            }

            return answer;


    }



    public static void main(String[] args) {

        String s = "()()";
        System.out.println(solution(s));


    }
}
