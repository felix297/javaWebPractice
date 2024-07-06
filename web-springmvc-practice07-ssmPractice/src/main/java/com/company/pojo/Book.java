package com.company.pojo;

public class Book {
    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;

    public void setBookId (int bookId) {
        this.bookId = bookId;
    }

    public void setBookName (String bookName) {
        this.bookName = bookName;
    }

    public void setBookCounts (int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public void setDetail (String detail) {
        this.detail = detail;
    }

    public int getBookId () {
        return this.bookId;
    }

    public String getBookName () {
        return this.bookName;
    }

    public int getBookCounts () {
        return this.bookCounts;
    }

    public String getDetail () {
        return this.detail;
    }
}