package ctest;

public class Ctest2 {
    //학생들은 각자 정수 번호를 갖는다.
    //이 학교 학생 3명의 정수 번호를 더했을때 0이되면 3명의 학생은 삼총사
    //ex) 5명 -2,3,0,2,-5일때 -2,0,2는 삼총사 or 3,2,-5 삼총사->두가지
    //정수 배열number이 주어질때 삼총사를 만들 수 있는 방법의수를 return 하도록.
    //for문 3개 필요할듯

    public static int solution(int[] number, int numberlen){
        int answer  = 0;
        for(int i=0;i<numberlen;i++){
            for(int j=i+1;j<numberlen;j++){
                for(int k=j+1;k<numberlen;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }

                }
            }
        }

        return answer;





    }
    public static void main(String[] args) {
        int[] a = {-3,-2,-1,0,1,2,3};
        int b = a.length;
        System.out.println(solution(a,b));

    }
}
