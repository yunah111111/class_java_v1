package startcraft.ver_3;

import startcraft.ver_1.Zealot;
import startcraft.ver_1.Zergling;

public class GameTest {

    public static void main(String[] args) {
        // 질럿이 저글링을 공격하는 시나리오
        Zealot z1 = new Zealot("질럿1");
        Zergling ze1 = new Zergling("저글링1");
        Zergling ze2 = new Zergling("저글링2");

        for (int i = 0; i < 10; i++) {
            z1.attackZergling(ze1);
        }
        ze1.showInfo();


        z1.showInfo();
        ze1.showInfo();


        ze2.attackZealot(z1);
        for (int i = 0; i < 10; i++) {
            ze2.attackZealot(z1);
        }
        z1.showInfo();

    } // end of main

} // end of class
