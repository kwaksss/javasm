package workshop;

public class EngineCar extends Car {

    //추상 클래스 Car의 모든 필드와 같아서 따로 선언x
    public EngineCar() {}

    public EngineCar(int serial, String name,String color,double fuelSize,double crrFuel) {
        super(serial,name,color,fuelSize,crrFuel);
    }

    //method override 할것도 없음.
    //그냥 Car 그대로 사용.

}
