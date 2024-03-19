package practice.ch02.sample1;

public class Main {
    public static void main(String[] args) {
        // 어댑터를 이용하지 않음
        // Banner b = new Banner("권나래");
        // b.showWithParen();
        // b.showWithAster();
    

        // Print 인터페이스를 이용해서 코딩을 해야 하는 상황
        Print p = new PrintBanner("권나래");
        p.printWeak();
        p.printStrong();
    }
}
