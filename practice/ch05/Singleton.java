package practice.ch05;

public class Singleton {
    // 이 클래스가 로드될 때 한 번만 실행 됨
    private static Singleton s = new Singleton();

    private Singleton() {
        System.out.println("인스턴트를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return s;
    }
}
