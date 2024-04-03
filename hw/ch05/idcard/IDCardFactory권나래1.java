package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactory권나래1 extends Factory {
    private static IDCardFactory권나래1 singleton = new IDCardFactory권나래1(); // 권나래: singleton 패턴 적용

    private IDCardFactory권나래1() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static IDCardFactory권나래1 getInstance() {
        return singleton;
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
