package hw.ch17;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();

        // 관찰 대상
        NumberGenerator png = new PrimeNumberGenerator();

        // 관찰자들
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new NamePrintObserver();

        // 관찰자를 관찰대상에 등록
        png.addObserver(observer1);
        png.addObserver(observer2);
        png.addObserver(observer3);

        // 관찰대상에게 상태변화를 실행하도록 함
        png.execute();
    }
}
