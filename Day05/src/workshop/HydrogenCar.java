package workshop;

public class HydrogenCar extends Car {

    private double distance;//단지, 최대 갈 수 있는 거리 정보.

    public HydrogenCar() {}

    public HydrogenCar(int serial, String name, String color, double fuelSize, double currFuel, double distance) {
        super(serial, name, color, fuelSize, currFuel);
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "HydrogenCar:" + super.toString() +
                "distance=" + distance;

    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void addFuel(double money)  {
        super.addFuel(money);
        //수정 필요.
    }







}
