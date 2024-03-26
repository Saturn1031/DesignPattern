package hw.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new KwonNaraeDisplay("권나래", "20220878", 3); // 권나래: 객체 생성 부분 수정

        d1.display(10);
        d1.display(5);
    }
}
