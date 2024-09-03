public class Main2 {
    public static void main(String[] args) {
        float f1 = 10.2F;
        float f2 = 10.2F;
        float f3 = f1 + f2;
        System.out.println(f3);

        double d1 = 10.2;
        int a = 10;
        int b = 3;
        double result = a * 1.0/b;
        //자바는 오른쪽에서 계산되어서 왼쪽으로 들어간다.
        //따라서 정수형이 계산되어서 3인데 왼쪽 자료형이 double이니깐 3.0으로 출력
        System.out.printf("%3.4f",result);
    }
}
