package ch05.A3a;

// Main 클래스가 스레드가 됨
public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");

        // 스레드 객체를 3개 생성해서 시작시킴
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    // 이 스레드가 하는 일
    @Override
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj); // 객체의 주소가 출력
    }

    public Main(String name) {
        super(name);
    }
}
