package practice.ch07;

public class Main {
    public static void main(String[] args) {
        // TextBuilder 이용
        TextBuilder b1 = new TextBuilder();
        Director d1 = new Director(b1);
        d1.construct();
        b1.getTextResult();
    }
}
