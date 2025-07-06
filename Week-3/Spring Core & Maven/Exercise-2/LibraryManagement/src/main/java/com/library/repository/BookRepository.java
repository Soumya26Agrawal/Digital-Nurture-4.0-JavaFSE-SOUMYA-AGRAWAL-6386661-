package com.library.repository;

public class BookRepository {
    public void storeBook(int bookId){
        System.out.println("Book with id "+bookId+ " stored successfully");
    }
    public void getAllBooks(){
        System.out.println("Books fetched successfully");
    }
    public void deleteBook(int bookId){
        System.out.println("Book with id "+bookId+ " deleted successfully");
    }
}
