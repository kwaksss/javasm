package oop1;

public class Main1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("K1","red");
        Car car3 = new Car(100,"K2","blue");

//        car2.name = "K9";
        car2.setColor("blue");
        System.out.println(car1.getColor());
        //캡슐화된(private된) 필드의 정보를 가져오고 싶다.

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        car1.go();
        car2.go();
        car3.go();

    }
}
