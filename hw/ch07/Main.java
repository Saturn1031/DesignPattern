package hw.ch07;

public class Main {
    public static void main(String[] args) {
        XMLBuilder xmlbuilder = new XMLBuilder();
        Director director = new Director(xmlbuilder);
        director.construct();
        String result = xmlbuilder.getXmlResult();
        System.out.println(result);
    }
}
