package workshop;

// AirUnit.java
public abstract class AirUnit extends Unit {
    private int flyspeed;     // 비행 속도
    public AirUnit(int hp, int attackDamage, int armor, int flyspeed) {
        super(hp, attackDamage, armor);
        this.flyspeed = flyspeed;
    }

    public int getFlyspeed() {
        return flyspeed;
    }

    public void setFlyspeed(int flyspeed) {
        this.flyspeed = flyspeed;
    }

    public abstract void transport();  // 수송
    public abstract void cloak();      // 은신

    @Override
    public void displayInfo() {
        // 호출된 클래스의 displayInfo 메서드를 호출하여 체력, 공격력, 방어력, 비행 속도를 출력
        super.displayInfo();
        System.out.println("비행 속도: " + flyspeed);
    }
}

