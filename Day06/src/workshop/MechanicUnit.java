package workshop;

public class MechanicUnit extends GroundUnit {

    public MechanicUnit(int hp, int attackDamage, int armor, int x, int y) {
        super(hp, attackDamage, armor, x, y);
    }

    public  void go(){};
    public void attack(){};
    public void stop(){};

    public  void repair(){

    };  // 수리 기능
}

