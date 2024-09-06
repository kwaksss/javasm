package statics;

public class Car {
    private int serial;
    private String name;
    private String color;
    //Car라는 객체가 주인.
    public static String vender = "KK";
    //Car라는 클래스가 주인.
    //객체와는 전혀 상관없음.
    //클래스에 의해서 객체가 아무리 생성 된다 한들 클래스만의 고유한 데이터를 갖는다.

    static {
        System.out.println("static block");
        System.out.println("Loading... Car class");
    }
    public static int count = 0;

    public Car(){

    }
    public Car(String name, String color) {
        this.serial = ++count;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
