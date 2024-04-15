package hw.ch11;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();

        // 권나래: 폴더 생성
        Directory myDocuments = new Directory("MyDocuments", "20240401", "KwonNarae");
        Directory myData = new Directory("MyData", "20240401", "KwonNarae");
        Directory myPictures = new Directory("MyPictures", "20240401", "KwonNarae");

        // 권나래: MyDocuments 폴더의 하위 폴더와 파일 생성
        myDocuments.add(new File("권나래0.doc", "20240501", 1000, "KwonNarae"));
        myDocuments.add(myData);

        // 권나래: myData 폴더의 하위 폴더와 파일 생성
        myData.add(new File("권나래1.doc", "20240501", 2000, "KwonNarae"));
        myData.add(new File("권나래2.java", "20240501", 3000, "KwonNarae"));
        myData.add(myPictures);

        // 권나래: myPictures 폴더의 하위 폴더와 파일 생성
        myPictures.add(new File("권나래3.gif", "20240601", 4000, "KwonNarae"));
        myPictures.add(new File("권나래4.jpg", "20240601", 5000, "KwonNarae"));
        myPictures.add(new File("권나래5.png", "20240601", 6000, "KwonNarae"));
        
        // 권나래: 최상위 폴더의 리스트 출력
        myDocuments.printList();
        System.out.println();
    }
}
