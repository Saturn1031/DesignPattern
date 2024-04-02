package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // 프로덕트의 원본(prototype)을 관리함
    private Map<String,Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy(); // 원본으로부터 객체를 복제해서 리턴
    }
}
