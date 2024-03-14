package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIteratorBackward implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIteratorBackward(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1; // 권나래: 마지막 위치로 설정
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) { // 권나래: 꺼내 올 책이 더 있으면 true, 없으면 false
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index--; // 권나래: 위치를 한 칸 앞으로 옮김
        return book;
    }
}
