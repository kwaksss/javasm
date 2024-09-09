package workshop;

import java.util.ArrayList;
import java.util.List;


public class Dropship extends AirUnit {
    private List<Unit> cargo; // 수송 가능한 유닛 목록
    private static final int CAPACITY = 8; // 수송 가능량

    public Dropship() {
        super(150, 0, 1,15);  // 체력, 공격력, 방어력 설정 (예시)
        this.cargo = new ArrayList<>();
    }

    @Override
    public void go() {
        System.out.println("Dropship이 이동합니다.");
    }

    @Override
    public void attack() {
        System.out.println("Dropship은 공격할 수 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("Dropship이 정지합니다.");
    }

    @Override
    public void transport() {
        if (cargo.size() < CAPACITY) {
            System.out.println("Dropship이 유닛을 수송합니다.");
        } else {
            System.out.println("수송 가능량이 초과되었습니다.");
        }
    }

    @Override
    public void cloak() {
        System.out.println("Dropship은 은신할 수 없습니다.");
    }

    // 유닛 추가 메서드
    public boolean loadUnit(Unit unit) {
        if (cargo.size() < CAPACITY) {
            cargo.add(unit);
            System.out.println("유닛을 수송하였습니다. 현재 수송 유닛 수: " + cargo.size());
            return true;
        } else {
            System.out.println("수송 가능량이 초과되었습니다.");
            return false;
        }
    }
}

