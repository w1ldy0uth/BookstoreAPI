package com.bookstore.api.service.book;

import com.bookstore.api.dto.BookDTO;
import com.bookstore.api.entity.Book;
import com.bookstore.api.entity.BookFormat;
import com.bookstore.api.repository.BookFormatRepository;
import com.bookstore.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookServiceInterface {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookFormatRepository bookFormatRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book createBook(BookDTO book) {
        Book bookEntity = new Book();
        bookEntity.setTitle(book.getTitle());
        bookEntity.setAuthor(book.getAuthor());
        bookEntity.setSize(book.getSize());
        bookEntity.setFormat(bookFormatRepository.findById(book.getFormat_id())
                .orElseThrow(() -> new IllegalArgumentException("Invalid format ID")));
        return bookRepository.save(bookEntity);
    }

    @Override
    public Book updateBook(Long id, BookDTO book) {
        Book bookEntity = new Book();
        bookEntity.setId(id);
        bookEntity.setTitle(book.getTitle());
        bookEntity.setAuthor(book.getAuthor());
        bookEntity.setSize(book.getSize());
        bookEntity.setFormat(bookFormatRepository.findById(book.getFormat_id())
                .orElseThrow(() -> new IllegalArgumentException("Invalid format ID")));
        return bookRepository.save(bookEntity);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
