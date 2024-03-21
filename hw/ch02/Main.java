package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();
        
        // 어댑터 생성
        FileIO f = new FileProperties();

        try {
            f.readFromFile("file.txt");

            f.setValue("Year", "2024");
            f.setValue("bornYear", "2002");
            f.setValue("StudentId", "20220878");
            f.setValue("Name", "Kwon Narae");
            f.setValue("Location", "Uijeongbu");

            f.writeToFile("KwonNarae.txt");

            System.out.println("KwonNarae.txt is created.");

            System.out.println(f.getValue("name"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
