package control;

public class Control1 {
    public static void main(String[] args) {
        int grade = 3;
        switch (grade) {
            case 1: System.out.println("냉장고");
            case 2: System.out.println("세탁기");
            case 3: System.out.println("에어컨");
                    break;
                    //break가 case3 아래 있어서 grade = 1 인경우 냉장고,세탁기,에어컨 전부 해당.
                    //위와같은경우 if~else로 하면 볼륨이 커짐.

            default: System.out.println("Try Again");
            //default는 case에 없는 숫자 일때,
        }
    }
}
