package practice.ch15;

import java.io.FileWriter;

import practice.ch15.pagemaker.HtmlWriter;
import practice.ch15.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        // HtmlWriter writer = new HtmlWriter(new FileWriter("welcome.html"));
        // writer.title("");
        // writer.link("", "");
        // writer.paragraph("");
        // writer.close();

        PageMaker.makeWelcomePage("", "");

        PageMaker.makeLinkPage("");
    }
}
