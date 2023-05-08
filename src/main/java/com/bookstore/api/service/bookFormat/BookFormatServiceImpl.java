package com.bookstore.api.service.bookFormat;

import com.bookstore.api.dto.BookFormatDTO;
import com.bookstore.api.entity.BookFormat;
import com.bookstore.api.repository.BookFormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookFormatServiceImpl implements BookFormatServiceInterface {

    @Autowired
    private BookFormatRepository bookFormatRepository;

    @Override
    public List<BookFormat> getAllBookFormats() {
        return bookFormatRepository.findAll();
    }

    @Override
    public Optional<BookFormat> getBookFormatById(Long id) {
        return bookFormatRepository.findById(id);
    }

    @Override
    public BookFormat createBookFormat(BookFormatDTO bookFormat) {
        BookFormat bookFormatEntity = new BookFormat();
        bookFormatEntity.setFormat(bookFormat.getFormat());
        return bookFormatRepository.save(bookFormatEntity);
    }

    @Override
    public BookFormat updateBookFormat(Long id, BookFormatDTO bookFormat) {
        BookFormat bookFormatEntity = new BookFormat();
        bookFormatEntity.setId(id);
        bookFormatEntity.setFormat(bookFormat.getFormat());
        return bookFormatRepository.save(bookFormatEntity);
    }

    @Override
    public void deleteBookFormat(Long id) {
        bookFormatRepository.deleteById(id);
    }
}
