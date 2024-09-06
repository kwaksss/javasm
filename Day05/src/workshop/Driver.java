package workshop;

public class Driver {
    private String name;
    private int age;

    private double money;

    public Driver() {
    }

    public Driver(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money -= money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';

    }
}
