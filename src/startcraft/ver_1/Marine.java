package startcraft.ver_1;

import jdk.swing.interop.SwingInterOpUtils;

public class Marine {

    private String name; // null
    private int power; // 0
    private int hp; // 0

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }


    // 1. 마린이 저글링을 공격합니다.
    public void attackZergling(Zergling zergling) {
        if (zergling.getHp() <= 0) {
            System.out.println(this.name + "은(는) 이미 사망하여 공격할 수 없습니다.");
            return;
        }
        System.out.println(this.name + "이(가) " + zergling.getName() + "을(를) 공격합니다.");
        zergling.beAttacked(this.power);
    }

    // 2. 마린이 질럿을 공격합니다.
    public void attackedZealot(Zealot zealot){
        if (zealot.getHp() <= 0) {
            System.out.println(this.name + "은(는) 이미 사망하여 공격할 수 없습니다.");
            return;
        }
        System.out.println(this.name + "이(가) " + zealot.getName() + "을(를) 공격합니다.");
        zealot.beAttacked(this.power);
    }

    // 3. 자기 자신이 공격을 당합니다.
    public void beAttackted(int damage) {
        if (this.hp <= 0) {
            System.out.println(this.name + "은(는) 이미 사망한 상태입니다.");
            return;
        }
        this.hp -= damage;
        System.out.println(this.name + "이(가) 공격을 당합니다.");
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.name + "은(는) 사망했습니다.");
        }
    }

    // 4. 내 현재 상태 출력(콘솔) 기능 만들기
    public void showInfo() {
        System.out.println("-------상태창-------");
        System.out.println("이름: " + name);
        System.out.println("현재 공격력: " + power);
        System.out.println("현재 생명력: " + hp);
    }

}
