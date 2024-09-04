package variable;

public class Var5 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        //s1과 s2는 같은 주소를 갖는다.
        //string pool에 들어있는 "Hello"를 참조 하므로.
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        //s3와 s4는 다른 주소값을 갖는다.

        //주소비교문
//        if(s1 == s2){
//            System.out.println("s1 equals s2");
//        }else {
//            System.out.println("s1 not equals s2");
//        }
//
        //값 비교할때
        if(s1.equals(s4)){
            System.out.println("s1 equals s4");
        }else {
            System.out.println("s1 not equals s4");
        }
    }
}
