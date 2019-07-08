package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();

        Book book2 = new Book("마닳", "성기하", 100);
        Book book3 = new Book("센스업", "전유원");
        Book book4 = new Book("췤");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());
        System.out.println();
        book.setTitle("수학의 바이블");
        book.setAuthor("김재영");
        book.setPage(100);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());
        System.out.println();

        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPage());
        System.out.println();

        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPage());
        System.out.println();

        System.out.println(book4.getTitle());
        System.out.println(book4.getAuthor());
        System.out.println(book4.getPage());
        System.out.println();


    }
}
