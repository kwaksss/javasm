package workshop;

public class Medic extends BionicUnit {

    public Medic(int hp, int attackDamage, int armor,int x,int y) {
        super(hp, attackDamage,armor,x,y);  // 체력, 공격력, 방어력 설정 (예시)
    }

    @Override
    public void go() { System.out.println("Medic이 이동합니다."); }

    @Override
    public void attack() { System.out.println("Medic은 공격할 수 없습니다."); }

    @Override
    public void stop() { System.out.println("Medic이 정지합니다."); }

    @Override
    public void stimPack() { System.out.println("Medic은 스팀팩을 사용할 수 없습니다."); }

    @Override
    public void heal(Unit target) { System.out.println("Medic이 힐을 사용합니다.");
        if(target instanceof BionicUnit){// 바이오닉 유닛만 힐 가능
            System.out.println("Medic이 " + target.getClass().getSimpleName() + "을(를) 힐했습니다!");

        }
    }
}

