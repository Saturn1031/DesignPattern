package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        // 부모의 인자 없는 생성자가 자동으로 호출됨
        // super();

        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); // this.toString() 자동 호출
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
