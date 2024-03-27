package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory{
    Vector<String> modelNames = new Vector<String>(); // 권나래: 멤버 변수 추가

    @Override
    protected Product createProduct(String modelName) {
        return new Car_KwonNarae(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        modelNames.add(((Car_KwonNarae) product).getModelName()); // 권나래: 다운캐스팅 후 모델명을 Vector에 add
    }
    
    public void printAllModalNames() { // 권나래: iterator 사용하여 모델명을 출력하는 함수
        Iterator<String> iterator = modelNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
