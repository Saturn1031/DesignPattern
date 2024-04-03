package hw.ch05;

import hw.ch05.idcard.IDCardFactory권나래1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();

        IDCardFactory권나래1 factory1 = IDCardFactory권나래1.getInstance();
        IDCardFactory권나래1 factory2 = IDCardFactory권나래1.getInstance();
        
        if (factory1 == factory2) {
            System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        } else {
            System.out.println("factory1과 factory2는 같은 인스턴스가 아닙니다.");
        }
    }
}
