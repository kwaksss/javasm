package Array;

public class Array2 {
    public static void main(String[] args) {
        String s[] = new String[3];
        s[0] = "A";
        s[1] = "B";
        s[2] = "C";
        StringBuffer sb = new StringBuffer();
        //가변을 위한 StringBuffer
        for (String str : s){

            sb.append(str);
            System.out.println(sb.toString());


        }
    }
}
