package workshop;

public class Tank extends MechanicUnit {
    private boolean siegeMode;
    // 시즈 모드 여부
    // 초기값 = false



    public Tank(int hp, int attackDamage, int armor, int x, int y) {
        super(hp, attackDamage, armor, x, y);
    }

    public Tank(boolean siegeModem, int hp, int attackDamage, int armor, boolean siegeMode,int x, int y) {
        super(hp,attackDamage,armor,x,y);
        this.siegeMode = siegeMode;

    }

    @Override
    public void go() {

        System.out.println("탱크가 앞으로 이동합니다.");/* 이동 구현 */
    }
    @Override
    public void attack() {
        if(siegeMode == true){
           setAttackDamage(getAttackDamage()+1);
           System.out.println("탱크가 시즈모드로 공격합니다.");

            /* 공격 구현 */
        }
        else {
            System.out.println("탱크가 일반모드로 공격합니다.");

        }


    }
    @Override
    public void stop() { /* 정지 구현 */
        System.out.println("탱크가 멈춥니다.");

    }
    @Override
    public void repair() { /* 수리 구현 */
        System.out.println("탱크를 수리했습니다.");


    }

    public void siegeMode() { //탱크만의 고유 메서드.
        this.siegeMode = !siegeMode; //true로 바꿈
        if (siegeMode) {//true이면
            System.out.println("탱크가 시즈 모드로 전환되었습니다.");

        } else {
            System.out.println("탱크가 일반 모드로 전환되었습니다.");
        }
    }

    public void displayInfo(){
        System.out.println("탱크의 정보입니다.");
        System.out.println("체력: " + getHp() + ", 공격력: " + getAttackDamage() + ", 방어력: " + getArmor() + ",시즈모드:" +siegeMode + ", 좌표:" + getX() + "," + getY());

    }
}

