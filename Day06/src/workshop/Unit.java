package workshop;

public abstract class Unit {
    private int hp;           // 체력
    private int attackDamage; // 공격력
    private int armor;        // 방어력

    public Unit() {
    }

    public Unit(int hp, int attackDamage, int armor) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.armor = armor;
    }



    public abstract void go();       // 이동
    public abstract void attack();   // 공격
    public abstract void stop();// 정지

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void displayInfo() {
        System.out.println("체력: " + hp + ", 공격력: " + attackDamage + ", 방어력: " + armor);
    }
}
