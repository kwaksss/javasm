package variable;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        String str = "Java";
        int num = 100;
        double num2 = 10/3.0;//10/3은 정수가 되니까 둘중하나는 실수로 바꿔줌
        System.out.printf("%s이고,%d이고,%10.3f\n",str,num,num2);
        System.out.printf("Ok\n");
        System.out.printf("%d\n",num);//%d 정수형
        System.out.printf("%o\n",num);//8진수
        System.out.printf("%x\n",num);//16진수


    }
}