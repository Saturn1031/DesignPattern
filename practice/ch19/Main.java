package practice.ch19;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");

        // SafeFrame에게 시각을 알려줌
        while (true) { // 무한루프
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
