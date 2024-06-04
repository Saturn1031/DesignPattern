package practice.ch18;

import practice.ch18.game.Gamer;
import practice.ch18.game.Memento;

// Caretaker 역할
public class Main {
    public static void main(String[] args) {
        Gamer g1 = new Gamer(1000000);
        Memento m1 = null;

        for (int i = 0; i < 10; i++) {
            g1.bet();
            System.out.println(g1);

            if (i == 5) {
                m1 = g1.createMemento();
                System.out.println("*** frm memento: " + m1.getMoney());
            }
            if (i == 7) {
                // 보관했던 상태로 복원
                g1.restoreMemento(m1);
                System.out.println("*** frm memento: " + m1.getMoney());
            }
        }
    }
}
