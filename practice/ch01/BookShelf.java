package practice.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    // 생성자
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    // 책 한 권 꺼내오기
    public Book getBookAt(int index) {
        return books[index];
    }

    // 책 한 권 꽂기
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    // 책 개수 얻어오기
    public int getLength() {
        return last;
    }

    @Override
    // 책꽂이 반복자를 리턴하는 메소드
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}