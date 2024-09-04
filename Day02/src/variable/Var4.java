package variable;

public class Var4 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int result = a + b;

        System.out.println(result);
        String str = "Hello";
        //heap 메모리 안에 string pool이 생기고 그 안에 "Hello"가 들어감.
        //Hello(10byte)가 유니코드로 변환되고, 2진수로 바껴서 들어감.
        //pool 안에있는 Hello의 주소 str에 들어감.(1)
        //pool 안에있는 Hello의 주소는 스택에 생김.

        System.out.println(str);
        String str2 = new String("Hello");
        //new 때문에 힙메모리에 그냥 "Hello"라는게 생긴다.(2)
        //이것에 해당하는 주소가 스택에 생성.->str2에 들어감.

        System.out.println(str2);

        String str3 = "Hello";
        //"Hello"라는게 string pool에 있는지 먼저 check
        //위에서 이미 있으므로 같은 pool의 주소가 스택에 들어감.
        //str3가 가지고 있는건 주소값(1)
        System.out.println(str3);

        String str4 = new String("Hello");
        System.out.println(str4);
        //new이므로 힙영역에 새로운 Hello가 생김.
        //새로운 Hello의 주소값을 가진다.(ex 3)

    }
}
/*
1.코드가 올라감
2.코드 실행
3.스택에 100이 들어감
4.스택에 200이 들어감.
5.연산한 값 300이 스택에 생기고, result에 들어감.
6.메모리에 있는 result 화면에 출력.
7.
 */

