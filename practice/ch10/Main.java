package practice.ch10;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("권나래", new ProbStrategy(100));
        Player p2 = new Player("박보검", new WinningStrategy(200));

        Hand h1 = p1.nextHand();
        Hand h2 = p2.nextHand();

        if (h1.isStrongerThan(h2)) {
            p1.win();
            p2.lose();
        } else if (h1.isWeakerThan(h2)) {
            p1.lose();
            p2.win();
        } else {
            p1.even();
            p2.even();
        }

        System.out.println(p1); // p1.toString() 자동 호출
        System.out.println(p2); // p2.toString() 자동 호출

        // 전략을 동적으로 교체
        p1.setStrategy(new WinningStrategy(300));
    }
}
