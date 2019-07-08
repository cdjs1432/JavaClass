package org.dimigo.oop;

public class BookTest2 {
    private static boolean flag;

    private static void compare() {
        int a = 10;
        int b = 10;
        System.out.println(a == b ? "True" : "False");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "True" : "False");

        book2.setTitle("수학의 바이블");
        System.out.println(book.getTitle());
    }
    public static void main(String[] args) {
        compare();
        System.out.println("-----------------------------------");

        int num = 5;
        methodA(num);
        System.out.println(num);
        System.out.println("-----------------------------------");

        Book book = new Book("컴퓨터네트워크");
        methodB(book);
        System.out.println(book.getTitle());
        System.out.println("-----------------------------------");

        methodC(book);
        System.out.println(book.getTitle());
        System.out.println("-----------------------------------");

        Book book2 = new Book();
        System.out.println(book2.getTitle());
    }

    private static void methodC(Book book) {
        book.setTitle("공업수학");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book ("중궈");
        System.out.println(book.getTitle());
    }

    private static void methodA(int num) {
        num++;
        System.out.println(num);
    }
}
