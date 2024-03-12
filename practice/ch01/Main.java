package practice.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // Iterator 패턴
        // 1. 책꽂이한테 책꽂이 반복자를 요청해서 얻음
        Iterator<Book> it = bookShelf.iterator();

        // 2. 책꽂이 반복자를 이용해서 책을 한 권씩 꺼내 옴
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        // 확장 for문을 사용하는 방법
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}