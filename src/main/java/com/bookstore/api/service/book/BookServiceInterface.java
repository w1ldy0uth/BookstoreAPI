package com.bookstore.api.service.book;

import com.bookstore.api.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookServiceInterface {
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book createBook(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
