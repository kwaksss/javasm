package oop1;

public class Car {
    private int serial;
    private String name;
    private String color;
    //private를 활용하여 캡슐화

    public Car() {
        serial = 0;

    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(int serial, String name, String color) {
        this.serial = serial;
        this.name = name;
        this.color = color;
    }
    //constructor: 속성값 초기화


    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    //이 클래스 에서 만든 객체를 String화 시키겠다.


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void go(){
        System.out.println(this.name);
        //this: 해당 객체의 이름 의미
        //Car가 지칭하는 ..
        System.out.println("Car go");
    }
    public void brake(){
        System.out.println(this.name);
        System.out.println("Car brake");
    }
}
