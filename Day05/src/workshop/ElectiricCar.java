package workshop;

public class ElectricCar extends Car {

    private double distance;

    public ElectricCar(){}

    public ElectricCar(int serial, String name, String color, double fuelSize, double currFuel, double distance) {

        super(serial, name, color, fuelSize, currFuel);
        this.distance = distance;

    }

    @Override
    public String toString() {
        return "ElectiricCar: " +super.toString() +
                "distance=" + distance;
    }

    public double getDistance() {}

    @Override
    public void addFuel(double money)  {
        super.addFuel(money);
    }
}
