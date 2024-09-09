package workshop;

public class Wraith extends AirUnit {
    private boolean cloaked; // 은신 상태

    public Wraith() {
        super(120, 16, 0, 25); // 체력, 공격력, 방어력 , 비행속도 설정 (예시)
        this.cloaked = false; // 초기 상태는 은신 안 함
    }

    @Override
    public void go() {
        System.out.println("Wraith가 이동합니다.");
    }

    @Override
    public void attack() {
        System.out.println("Wraith가 적을 공격합니다.");
    }

    @Override
    public void stop() {
        System.out.println("Wraith가 정지합니다.");
    }

    @Override
    public void transport() {
        System.out.println("Wraith는 수송할 수 없습니다.");
    }

    @Override
    public void cloak() {
        cloaked = !cloaked;
        System.out.println("Wraith 은신 상태: " + (cloaked ? "은신 중" : "은신 해제됨"));
    }
}
