package practice.ch02.sample1;

// Vender class (다른 회사에서 제공하는 클래스)
// Adaptee
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
