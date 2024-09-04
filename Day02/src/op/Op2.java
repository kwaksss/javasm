package op;

public class Op2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = ++a + b++;
        //a는 연산 전에 ++이됨. b는 연산이 되고 result에 값이 들어간담에 b에 ++
        System.out.printf("%d, %d, %d",a,b,result);
    }
}
