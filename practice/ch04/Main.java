package practice.ch04;

import practice.ch04.framework.Product;
// import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // 신분증 직접 생성하기
        // Product id1 = new IDCard("narae");
        // id1.use();

        // 공장을 통해서 신분증 생성하기
        IDCardFactory f1 = new IDCardFactory();
        Product id2 = f1.create("narae2");
        id2.use();
    }
}
