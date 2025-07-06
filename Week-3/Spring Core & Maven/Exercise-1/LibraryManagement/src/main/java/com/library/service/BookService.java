package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    public void saveBook(int bookId){
        bookRepository.storeBook(bookId);
    }
}
