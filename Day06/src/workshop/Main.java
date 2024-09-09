package workshop;

public class Main {
    public static void main(String[] args) {


        Goliath goliath = new Goliath(40,10,10,5,5);
        Tank tank = new Tank(100,100,50,5,5);


//        wraith.go();
//        wraith.cloak();
//        wraith.stop();
//        dropship.go();
//        dropship.transport();
//        dropship.loadUnit(unit);
//        goliath.displayInfo();
//        goliath.attack();
//        marine.stimPack();

        tank.displayInfo();
        tank.go();
        tank.repair();
        tank.stop();
        tank.siegeMode();
        tank.attack();
        tank.displayInfo();
        goliath.displayInfo();
        goliath.repair();
        goliath.go();
        goliath.stop();
        goliath.attack();
        goliath.attack();


    }
}
