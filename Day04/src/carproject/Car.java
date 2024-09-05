package carproject;

public class Car {

    private int serial;
    private String name;
    private String color;
    private double fuelSize;
    private double currFuel;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(int serial, String name, String color, double fuelSize, double currFuel, Driver driver, Engine engine) {
        this.serial = serial;
        this.name = name;
        this.color = color;
        this.fuelSize = fuelSize;
        this.currFuel = currFuel;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fuelSize=" + fuelSize +
                ", currFuel=" + currFuel +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public double getCurrFuel() {
        return currFuel;
    }

    public void setCurrFuel(double currFuel) {
        this.currFuel = currFuel;
    }

    public double getFuelSize() {
        return fuelSize;
    }

    public int getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void go(int distance){

        this.currFuel -= (distance / 10 + engine.getPower());
        if(this.currFuel < 0){
            System.out.printf("연료 부족으로 %d만큼 못갑니다 더 적은 거리 입력하거나 연료를 채워주세요:\n",distance);
            this.currFuel += (distance / 10 + engine.getPower());

        }
        else {
            System.out.printf("%d만큼 갔습니다.\n", distance);

        }

        //연비 = 1L당 갈 수 있는거리.
        //power가 높을수록 연비가 낮다.
        //현재 연료양 - (
        //1L당 10km를 간다치면.. 현재 연료 - 거리/10 +power를 해야..
        //power가 0인건 연비가 10이라고 가정.



    }
    public void addFuel(double money) throws Exception {
        this.currFuel += money/1000.0;//처음 연료가 들어가.
        if(this.currFuel  > this.fuelSize){ //통보다 넘치면.
            this.currFuel -=  money/1000.0;//연료 넣기전으로 돌아가서

            System.out.println("연료통이 넘쳐서 만땅만큼만 돈 차감함.");
            driver.setMoney((this.fuelSize-this.currFuel)*1000);//만땅만큼 필요한 금액 기존에서 빼고
            this.currFuel = this.fuelSize;//만땅 만든다.

            //this.money = this.money - money




        } else if (this.currFuel  == this.fuelSize) {

            System.out.println("지금 만땅이야.");


        } else {
            //1000원에 1L라 가정.

            driver.setMoney(money);
            }
        }







    public void brake(){
        System.out.println("멈췄습니다.");
    }
}

class Engine {

    private int serial;
    private int power;
    private int size;

    public Engine() {
    }

    public Engine(int serial, int power, int size) {
        this.serial = serial;
        this.power = power;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "serial=" + serial +
                ", power=" + power +
                ", size=" + size +
                '}';
    }

    public int getPower() {
        return power;
    }
}

