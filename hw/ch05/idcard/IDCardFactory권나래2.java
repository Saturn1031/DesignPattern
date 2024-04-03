package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactory권나래2 extends Factory {
    private static IDCardFactory권나래2 singleton = null; // 권나래: 초기값 null

    private IDCardFactory권나래2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactory권나래2 getInstance() { // 권나래: synchronized 이용
        if (singleton == null) {
            singleton = new IDCardFactory권나래2();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000); // 권나래: 객체 생성 시 3초가 걸리도록 수정
        } catch (InterruptedException e) {
        }
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
