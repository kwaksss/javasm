package inter;

public class Tv implements Remote,Bluethooth {


    @Override
    public void turnOn() {
        System.out.println("Tv is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turned off");

    }


    @Override
    public void pairing() {

        System.out.println("Tv is pairing");//페어링이된다.

    }
}
