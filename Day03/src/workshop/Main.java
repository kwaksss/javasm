package workshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("로또게임을 시작합니다..");
        MyLotto lotto = new MyLotto();
        Logic logic = new Logic(lotto);
        logic.result();




    }
}
