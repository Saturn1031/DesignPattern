package practice.ch18.game;

import java.util.ArrayList;
import java.util.List;

// Gamer의 상태를 보존
public class Memento {
    // Gamer의 상태
    private int money;             // 소지금 (외부에 노출되어야 하는 정보)
    private List<String> fruits;  // 과일 (외부에 노출하지 않아야 되는 정보)

    // 소지금을 얻는다(narrow interface) => 객체의 정보 중 일부만 접근하게 해주는 인터페이스
    public int getMoney() {
        return money; // 외부에 노출되어야 하는 정보
    }

    // 생성자(wide interface) => 객채의 모든 정보를 접근해서 객체의 모든 상태를 변경할 수 있는 인터페이스
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    // 과일을 추가한다(wide interface)
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // 과일을 얻는다(wide interface)
    List<String> getFruits() {
         return new ArrayList<>(fruits);
    }
}
