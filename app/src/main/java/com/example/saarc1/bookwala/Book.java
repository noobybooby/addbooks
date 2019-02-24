package com.example.saarc1.bookwala;

public class Book {

   private String bookId;
   private String bookName;
   private String bookPrice;
   private String bookAuthor;
   private String bookImageUrl;

    public Book(){
    }

    public Book(String bookId,String bookName, String bookPrice, String bookAuthor, String bookImageUrl) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookImageUrl = bookImageUrl;


    }


    public String getBookImage() {
        return bookImageUrl;
    }

    public void setBookImageUrl(String bookImageUrl) {
        this.bookImageUrl = bookImageUrl;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
