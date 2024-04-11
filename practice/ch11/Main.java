package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // File 객체
        Entry f1 = new File("a.txt", 100);
        System.out.println(f1.getName());
        System.out.println(f1.getSize());
        f1.printList();
        f1.printList("c:/docs");

        // Directory 객체
        Entry d1 = new Directory("bin");

        ((Directory) d1).add(f1); // 다운캐스팅
    }
}
