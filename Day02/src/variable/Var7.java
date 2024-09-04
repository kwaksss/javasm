package variable;

public class Var7 {
    public static void main(String[] args) {
        String str = "Hello";
        //"Hello라는 String 값 변경 x

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        //sb.toString이 생략 되었다. 이유는 sb는 주소값을 갖고있는데 값이 나오기 때문.
        sb.append("World");
        System.out.println(sb);
    }
}
