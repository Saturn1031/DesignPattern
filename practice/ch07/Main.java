package practice.ch07;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // TextBuilder 이용
        TextBuilder b1 = new TextBuilder();
        Director d1 = new Director(b1);
        d1.construct();
        b1.getTextResult();

        // HTMLBuilder 이용
        HTMLBuilder hb1 = new HTMLBuilder();
        Director d2 = new Director(hb1);
        d2.construct();
        System.out.println(hb1.getHTMLResult() + "is created...");

        // FrameBuilder 이용
        FrameBuilder fb1 = new FrameBuilder();
        Director d3 = new Director(fb1);
        d3.construct();
        fb1.getFrameResult();
        JFrame frame = fb1.getFrameResult();
        frame.setVisible(true);
    }
}
