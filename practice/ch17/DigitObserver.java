package practice.ch17;

// 관찰자 1
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        // 관찰자가 통지받아서 하는 일
        System.out.println("DigitObserver:" + generator.getNumber());
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
