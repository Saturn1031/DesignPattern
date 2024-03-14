package practice.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    // private Book[] books;
    private List<Book> books;
    // private int last = 0;

    // 생성자
    public BookShelf(int initialsize) {
        // this.books = new Book[maxsize];
        this.books = new ArrayList<>(initialsize);
    }

    // 책 한 권 꺼내오기
    public Book getBookAt(int index) {
        // return books[index];
        return books.get(index);
    }

    // 책 한 권 꽂기
    public void appendBook(Book book) {
        // this.books[last] = book;
        books.add(book);
        // last++;
    }

    // 책 개수 얻어오기
    public int getLength() {
        return books.size();
    }

    @Override
    // 책꽂이 반복자를 리턴하는 메소드
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}