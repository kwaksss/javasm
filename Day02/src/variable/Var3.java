package variable;

public class Var3 {
   public double calc(int a, int b){
       return a*1.0/b;//a/b를 하면 int와 int의 연산이므로 결과가 int가 된다. double이고 싶어서 1.0을 곱했다.
   }
   public static void main(String[] args) {
       Var3 var3 = new Var3();
       int num1 = 10;
       int num2 = 20;
       double result = var3.calc(num1,num2);
       System.out.println(result);
   }
}
