package hw.ch19;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 15; hour <= 24; hour++) { // 권나래: 15:00 ~ 24:00을 반복하도록 수정
                frame.setClock(hour);   // 시간 설정
                try {
                    Thread.sleep(2000); // 권나래: 2초 당 한 시간이 흐르도록 수정
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
