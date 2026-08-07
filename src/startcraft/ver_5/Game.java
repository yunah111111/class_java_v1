package startcraft.ver_5;

public class Game {

    public static void main(String[] args) {

        Unit[] units = new Unit[3];
        units[0] = new Zealot("질럿1");
        units[1] = new Marine("마린1");

        units[0].attack(units[1]);

    } // end of main

} // end of class
