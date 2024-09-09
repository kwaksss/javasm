package ctest;

public class ctest1 {
    //2차원배열 필요할듯.
    //arr1,arr2를 각각 2진수로 바꾼다.
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer1 = {};
        String[] answer2 = {};
        String[] result = new String[n];
        //일단 arr1과 arr2를 2진수로 바꿔서 각각담음.
        for(int i = 0; i < arr1.length; i++){
            answer1[i] = Integer.toBinaryString(arr1[i]); // 10진수 -> 2진수
            answer2[i] = Integer.toBinaryString(arr2[i]);



        }
        for(int i = 0; i<n;i++){
            result[i] = String.format("%" + n + "s",result[i]);
        }


        //각각을 2차원 배열로 쪼갬

        //[0][i]씩 if문으로 둘다 0이면 0 둘다 1이면 #넣기.





        return answer1;
    }



    public static void main(String[] args) {

        int a = 5;
        int arr1[] = {9,20,28,18,11};
        int arr2[] = {30,1,21,17,28};
        System.out.println( solution(a, arr1, arr2));


    }
}
