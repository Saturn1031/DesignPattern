package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_KwonNarae extends Product {
    String modelName; // 권나래: 멤버 변수 추가

    public Car_KwonNarae(String modelName) { // 권나래: 생성자 작성
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println("모델명 " + modelName + "인 Car를 사용합니다."); // 권나래: use 메소드 작성
    }

    public String getModelName() { // 권나래: modelName의 getter 작성
        return modelName;
    }
    
}
