package inter;

public class Mobile {
    public static void main(String[] args) {
        Remote remote = new Air();
        remote.turnOff();
        remote.turnOn();

        Bluethooth bluethooth = new Tv();
        bluethooth.on();
        bluethooth.pairing();
    }
}
