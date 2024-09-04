package oop2;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("k1","red",50,10);
        try {
            car1.addFuel(20);//addFuel 함수를 쓸때는 정상,오류 두가지 상황이 발생.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(car1);

        car1.go(275);
        car1.brake();

    }
}
