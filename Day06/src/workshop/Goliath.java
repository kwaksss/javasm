package workshop;

import java.util.Scanner;

public class Goliath extends MechanicUnit {


    public Goliath(int hp, int attackDamage, int armor, int x, int y) {
        super(hp, attackDamage, armor, x, y);
    }

    @Override
    public void go() { /* 이동 구현 */
        System.out.println("골리앗이 앞으로 이동합니다.");

    }
    @Override
    public void attack() { /* 공격 구현 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("공격할 대상이 1.지상인지, 2.공중인지 선택하시오.");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("지상공격이 선택되었습니다. 총을 쏩니다.");

                break;
            case 2:
                System.out.println("공중공격이 선택되었습니다. 미사일을 쏩니다.");
                break;
        }

    }
    @Override
    public void stop() { /* 정지 구현 */
        System.out.println("골리앗이 멈춥니다.");

    }
    @Override
    public void repair() { /* 수리 구현 */
        System.out.println("골리앗이 수리되었습니다.");

    }

    public void displayInfo(){
        System.out.println("골리앗의 정보입니다.");
        System.out.println("체력: " + getHp() + ", 공격력: " + getAttackDamage() + ", 방어력: " + getArmor() + ", 좌표:" + getX() + "," + getY());

    }
}

