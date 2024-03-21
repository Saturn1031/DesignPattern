package practice.ch03;

public class Main {
    public static void main(String[] args) {
        // AbstractDisplay cd = new CharDisplay('a');

        AbstractDisplay x;

        x = new CharDisplay('a');

        // cd.open();
        // cd.print();
        // cd.close();

        // cd.display();
        x.display();

        // AbstractDisplay sd = new StringDisplay("dsds덕성덕성");
        x = new StringDisplay("덕성여대");

        // sd.open();
        // sd.print();
        // sd.close();

        // sd.display();
        x.display();
    }
}
