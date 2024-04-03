package hw.ch05;

import hw.ch05.idcard.IDCardFactory권나래2;

public class Main2 extends Thread {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();

        new Main2("최승훈").start();
        new Main2("권나래").start();
        new Main2("편도나").start();
    }

    @Override
    public void run() {
        IDCardFactory권나래2 factory = IDCardFactory권나래2.getInstance();
        System.out.println(getName() + ": 인스턴스 주소 = " + factory);
    }

    public Main2(String name) {
        super(name);
    }
}
