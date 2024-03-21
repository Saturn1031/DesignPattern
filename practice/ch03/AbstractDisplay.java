package practice.ch03;

// public abstract class AbstractDisplay {
public interface AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 추상 메소드들을 이용해서 구현
    // open 1번, print 5번, close 1번 -> 큰 흐름(틀, 템플릿)을 결정
    // 템플릿 메소드
    // public final default void display() {
    public default void display() {
        open();
        for (int i = 0; i < 10; i++) {
            print();
        }
        close();
    }
}
