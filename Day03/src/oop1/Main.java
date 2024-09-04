package oop1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        //객체 생성
        //constructor가 없을때는 자동으로 Car에 생성
        //constructor가 있을대는 따로 만들어 줘야됨.

        System.out.println(car);
        //reference Type 주소가 출력됨.

        //Car 클래스에 toString 함수를 해놓으면,
        //주소가 아닌 내용이 출력된다.
        //car.toString이 생략된것.

        car.go();
        //go가 실행될때 car레퍼런스의 go가 실행
        car.brake();

        Car car2 = new Car(100,"My Car","red");
        System.out.println(car2);
        //car2.toString인데 toString이 생략되어 car2
        car2.go();
        car2.brake();


    }
}
