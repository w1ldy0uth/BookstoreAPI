package com.bookstore.api.service.bookFormat;

import com.bookstore.api.dto.BookFormatDTO;
import com.bookstore.api.entity.BookFormat;

import java.util.List;
import java.util.Optional;

public interface BookFormatServiceInterface {
    List<BookFormat> getAllBookFormats();

    Optional<BookFormat> getBookFormatById(Long id);

    BookFormat createBookFormat(BookFormatDTO bookFormat);

    BookFormat updateBookFormat(Long id, BookFormatDTO bookFormat);

    void deleteBookFormat(Long id);
}
