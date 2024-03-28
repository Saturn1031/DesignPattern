package practice.ch05;

public class Singleton2 {
    private static Singleton2 s = null;

    private Singleton2() {
        System.out.println("Singleton2 객체가 생성되었습니다.");
    }

    public static Singleton2 getInstance() {
        if (s == null) { // getInstance()가 처음 호출되었다면...
            s = new Singleton2();
        }
        return s;
    }
}
