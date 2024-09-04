package Array;

public class Array4 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = {1,2,3,4,5};
        int c[] = new int[] {1,2,3,4,5};

        int d[][] = {{1,2,3,},{4,5,6}};
        d[0] = new int[10];
        d[1] = new int[5];

        System.out.println(d.length);

        int e[][] = {{1,2,3},{4,5,6}};
        int f[][] = new int[][]{{1,2,3},{4,5,6}};
        int g[][];
//    g = {{1,2,3},{4,5,6}}; int g[][];은 null 값이기때문에 이런식으로 못들어간다.

    }

}
