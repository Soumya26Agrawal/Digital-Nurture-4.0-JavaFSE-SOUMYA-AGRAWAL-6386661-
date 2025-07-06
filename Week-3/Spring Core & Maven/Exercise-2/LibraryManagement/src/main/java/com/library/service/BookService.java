package com.library.service;

import com.library.repository.BookRepository;


import com.library.repository.BookRepository;

public class BookService {
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    public void saveBook(int bookId){
        bookRepository.storeBook(bookId);
    }
    public void fetchBooks(){
        bookRepository.getAllBooks();
    }
    public void removeBook(int bookId){
        bookRepository.deleteBook(bookId);
    }
}
