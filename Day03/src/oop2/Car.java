package oop2;

import java.util.Random;

public class Car {

    private int serial;
    private String name;
    private String color;
    private double fuelSize;
    private double currFuel;

    public Car() {
        Random rand = new Random();
        this.serial = rand.nextInt(10000)+1;
    }

    public Car(int serial, String name, String color, double fuelSize, double currFuel) {
        this.serial = serial;
        this.name = name;
        this.color = color;
        this.fuelSize = fuelSize;
        this.currFuel = currFuel;
    }
    public Car(String name, String color, double fuelSize, double currFuel) {
        this();
        this.name = name;
        this.color = color;
        this.fuelSize = fuelSize;
        this.currFuel = currFuel;
    }
    //argument가 달라야됨

    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fuelSize=" + fuelSize +
                ", currFuel=" + currFuel +
                '}';
    }

    public void setCurrFuel(double currFuel) {
        this.currFuel = currFuel;
        System.out.println("Curr Fuel: " + currFuel);
    }

    public void go(int distance) {
        System.out.printf("%s %d 달렸습니다.\n",this.name,distance );
        this.currFuel -= distance/100.0;
        //1리터당 100km

    }
    public void brake(){
        System.out.printf("Brake::::%s\n",this.toString());

    }
    public void addFuel(double size) throws Exception {
        double a = size + this.currFuel;
        if(a > this.fuelSize){
            throw new Exception("EC0001");
//            System.out.println("넘칩니다.");//이건 Main에 전달 되지 않는다.
            //return; 쓸 필요 x

        }
        this.currFuel += size;

    }
}

