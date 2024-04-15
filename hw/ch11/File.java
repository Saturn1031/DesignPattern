package hw.ch11;

public class File extends Entry {
    private String name;
    private String date;
    private int size;
    private String author;

    public File(String name, String date, int size, String author) {
        this.name = name;
        this.date = date;
        this.size = size;
        this.author = author;
    }

    @Override
    public int getCount() { // 권나래: getCount() 메소드 작성
        return 1;
    }

    @Override
    public String getDate() { // 권나래: getDate() 메소드 오버라이드
        return date;
    }

    @Override
    public String getAuthor() { // 권나래: getAuthor() 메소드 오버라이드
        return author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
