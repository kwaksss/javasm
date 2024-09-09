package workshop;

public abstract class BionicUnit extends GroundUnit {

    public BionicUnit(int hp, int attackDamage, int armor,int x,int y) {
        super(hp, attackDamage, armor,x,y);


    }

    public abstract void stimPack();  // 스팀팩 사용
    public abstract void heal(Unit target);// 힐 사용


}
