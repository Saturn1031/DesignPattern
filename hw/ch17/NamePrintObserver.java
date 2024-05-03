package hw.ch17;

public class NamePrintObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("NamePrintObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("권나래 "); // 권나래: 이름을 관찰자로부터 얻은 숫자만큼 출력
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
