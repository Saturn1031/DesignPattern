package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private String date;
    private String author;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name, String date, String author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    @Override
    public int getCount() { // 권나래: getCount() 메소드 작성
        int count = 0;
        for (Entry entry: directory) {
            count += entry.getCount();
        }
        return count;
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
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
