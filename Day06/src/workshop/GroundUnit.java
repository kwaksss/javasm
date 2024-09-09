package workshop;

public abstract class GroundUnit extends Unit {

    public GroundUnit(int hp,int attackDamage,int armor ,int x, int y) {
        super(hp,attackDamage,armor);
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;



    // 공통적인 지상 유닛 동작


    public int getX() {
        return x;
    }



    public int getY() {
        return y;
    }


}

