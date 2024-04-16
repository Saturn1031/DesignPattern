package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // File 객체
        Entry f1 = new File("a.txt", 100);
        System.out.println(f1.getName());
        System.out.println(f1.getSize());
        f1.printList();
        f1.printList("c:/docs");

        Entry f2 = new File("h.txt", 200);

        // Directory 객체
        Entry d1 = new Directory("bin");

        ((Directory) d1).add(f1); // 다운캐스팅
        ((Directory) d1).add(f2);

        System.out.println(d1.getSize());

        d1.printList();

        Directory root = new Directory("root");

        root.add(d1);
        root.add(new File("root.txt", 300));
        root.printList();
        System.out.println(root.getSize());
    }
}
