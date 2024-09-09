package workshop;

public class Marine extends BionicUnit {
    private boolean stimPackUsed = false;  // 스팀팩 사용 여부
    private final int baseAttackDamage= 6; // 기본 공격력
    private final int stimPackBoostedAttack=12; // 스팀팩 사용 시 공격력 증가
    public Marine(int hp, int attackDamage, int armor,int x,int y) {
        super(hp, attackDamage,armor,x,y);// 체력, 공격력, 방어력 설정 (예시)

    }

    @Override
    public void go() { System.out.println("Marine이 이동합니다."); }

    @Override
    public void attack() {
        if (stimPackUsed) {
            System.out.println("Marine이 스팀팩을 사용하여 공격합니다! 공격력: " + getAttackDamage());
        } else {
            System.out.println("Marine이 공격합니다. 공격력: " + getAttackDamage());
        }
    }

    @Override
    public void stop() { System.out.println("Marine이 정지합니다."); }

    @Override
    public void stimPack() {
        if (getHp()>10){
            setHp(getHp()-10);
            setAttackDamage((stimPackBoostedAttack));
            stimPackUsed = true;
            System.out.println("Marine이 스팀팩을 사용합니다! 체력이 10 감소하고 공격력이 증가합니다.");
        }else{
            System.out.println("체력이 부족하여 스팀팩을 사용할 수 없습니다.");
        }
    }

    @Override
    public void heal(Unit target) { System.out.println("Marine은 힐을 사용할 수 없습니다."); }
}
