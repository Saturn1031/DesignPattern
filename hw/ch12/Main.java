package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();

        MultiStringDisplay md = new MultiStringDisplay();

        md.add("학번: 20220878");
        md.add("이름: 권나래");
        md.add("핸드폰 번호: 010-7566-9407");

        Display d1 = new SideBorder(md, '%');
        Display d2 = new FullBorder(d1);
        Display d3 = new UpDownBorder(d2, '=');
        Display d4 = new MultiSideBorder(d3, '*', 3);

        d4.show();
    }
}
