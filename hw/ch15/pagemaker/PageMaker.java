package hw.ch15.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeUrlPage(String filename) { // 권나래: makeUrlPage 작성
        try {
            Properties urlprop = Database.getProperties("urldata");
            String duksungurl = urlprop.getProperty("duksung");
            String naverurl = urlprop.getProperty("naver");
            String googleurl = urlprop.getProperty("google");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("권나래" + "의 URL page");
            writer.link(duksungurl, "duksung");
            writer.link(naverurl, "naver");
            writer.link(googleurl, "google");
            writer.close();
            System.out.println(filename + " is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
