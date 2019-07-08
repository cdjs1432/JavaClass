package org.dimigo.oop;

public class Book {
    // 필드 선언
    private String title = "수학의 정석";
    private String author = "홍성대";
    private int page = 350;

    // 기본생성자
    public Book() {
        System.out.println("기본 생성자 호출!");
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title) {
        this(title, "작자 미상");
    }

    // 메소드 선언
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
