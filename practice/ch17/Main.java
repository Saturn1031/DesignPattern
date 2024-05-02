package practice.ch17;

public class Main {
    public static void main(String[] args) {
        // 관찰대상 생성
        NumberGenerator ng1 = new RandomNumberGenerator();

        // 관찰자 생성
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();

        // 관찰자를 등록
        ng1.addObserver(o1);
        ng1.addObserver(o2);

        // 관찰 대상에게 숫자 생성 실행
        ng1.execute();
    }
}
