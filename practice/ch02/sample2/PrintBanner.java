package practice.ch02.sample2;

// 위임을 이용한 어댑터
public class PrintBanner extends Print {
    Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        // Banner에게 일을 시켜야 함 (위임)
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();        
    }
    
}
