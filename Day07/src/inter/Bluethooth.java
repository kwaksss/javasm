package inter;

public interface Bluethooth {

    void pairing();

    default void on(){ //외부에서 사용하는거니까 public이 생략되어있음.
        System.out.println("Bluethooth on");
    }
}
