package ctest;

public class ctest2 {
    //(),[],{}는 올바른 괄호 문자열.
    //올바른거+올바른거 = 올바른거.
    //(){}[]로 이루어진 문자열 s가 주어진다.
    //s를 왼쪽으로 x칸 만큼 회전시켰을대 s가 올바른 괄호 문자여링 되게하는 x의 개수
    public int solution(String s) {

        int answer = -1;

        //문자열 s를 x칸 만큼 왼쪽으로 회전시키는 알고리즘
        String input = "123"; // 예제 문자열
        int x = 2; // 회전 횟수

        // 문자열을 왼쪽으로 x번 회전시키는 메서드 호출
        String rotatedString = rotateLeft(s, x);

        // 결과 출력
        System.out.println("Original String: " + s);
        System.out.println("Rotated String: " + rotatedString);

        //올바른 문자열인지 check하는 알고리즘.
        return;
    }

    public static String rotateLeft(String str, int x) {
        if (str == null || str.isEmpty()) {
            return str; // 빈 문자열 또는 null 체크
        }

        int length = str.length();
        x = x % length; // 회전 횟수를 문자열 길이로 나눈 나머지

        // 회전 횟수가 0인 경우 문자열을 그대로 반환
        if (x == 0) {
            return str;
        }

        // 문자열의 앞부분과 뒷부분으로 나누어 결합
        String leftPart = str.substring(0, x);
        String rightPart = str.substring(x);

        return rightPart + leftPart;
    }



    public static void main(String[] args) {


    }

}

