package com.bookstore.api.service.book;

import com.bookstore.api.dto.BookDTO;
import com.bookstore.api.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookServiceInterface {
    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    Book createBook(BookDTO book);

    Book updateBook(Long id, BookDTO book);

    void deleteBook(Long id);
}
