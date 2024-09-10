package ctest;

public class ctest1 {
    //다트게임
    //3번 던진다.
    //점수는 0점~10점
    //S,D,T영역이 존재하고 각 영역 당첨시, 점수에서 1,2,3제곱으로 계산
    // 스타상* 해당점수,직전 점수 각 2배/첫번재 나오면 해당 점수만 2배,중첩가능.
    //아차상# 해당점수 마이너스. 스타와 중첩가능.
    //S,D,T는 점수마다 하나씩 존재.
    //스타상 아차상은 점수마다 둘중 하나만 존재하거나 존재X
    //0~10정수와 문자 S,D,T*,#로 구성된 문자열이 입력될시 총점수를 반환하는 함수.

//        public static int solution(String dartResult) {
//            double answer1 = 0;
//            double answer2 = 0;
//            double answer3 = 0;
//
//            String firstSegment = "";
//            String secondSegment = "";
//            String thirdSegment = "";
//
//            // StringBuilder를 사용하여 현재 구간을 구성합니다.
//            StringBuilder currentSegment = new StringBuilder();
//            int segmentCount = 0; // 구간의 개수를 추적합니다.
//
//            for (char c : dartResult.toCharArray()) {
//                if (Character.isDigit(c)) {
//                    // 숫자가 나오면 새로운 구간의 시작
//                    if (segmentCount == 0) {
//                        firstSegment = currentSegment.toString();
//                    } else if (segmentCount == 1) {
//                        secondSegment = currentSegment.toString();
//                    } else if (segmentCount == 2) {
//                        thirdSegment = currentSegment.toString();
//                    }
//                    currentSegment.setLength(0); // StringBuilder 초기화
//                    currentSegment.append(c);
//                    segmentCount++;
//                } else {
//                    // 숫자가 아닌 경우
//                    currentSegment.append(c);
//                }
//            }
//
//            // 마지막 구간 추가
//            if (segmentCount == 0) {
//                firstSegment = currentSegment.toString();
//            } else if (segmentCount == 1) {
//                secondSegment = currentSegment.toString();
//            } else if (segmentCount == 2) {
//                thirdSegment = currentSegment.toString();
//            }
//
//            if(firstSegment.charAt(1) == 'S'){
//
//                answer1 = Math.pow(firstSegment.charAt(0),1);
//
//
//            } else if (secondSegment.charAt(1) == 'D') {
//
//            } else if (thirdSegment.charAt(1) == 'S') {
//
//            }
//
//
//            return answer;
//        }

    public static void main(String[] args) {
        String s = "1S2D*3T";
        //1^1*2 + 2^2*2 + 3^3
        //1
        //1^1
        //
        System.out.println(solution(s));



    }
}
