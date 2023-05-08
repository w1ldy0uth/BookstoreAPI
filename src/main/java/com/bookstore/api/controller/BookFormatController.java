package com.bookstore.api.controller;

import com.bookstore.api.dto.BookFormatDTO;
import com.bookstore.api.entity.BookFormat;
import com.bookstore.api.service.bookFormat.BookFormatServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books/format")
public class BookFormatController {

    @Autowired
    private BookFormatServiceInterface bookFormatService;

    @GetMapping
    public List<BookFormat> getAllBookFormats() {
        return bookFormatService.getAllBookFormats();
    }

    @GetMapping("/{id}")
    public Optional<BookFormat> getBookFormatById(@PathVariable("id") Long id) {
        return bookFormatService.getBookFormatById(id);
    }
    @PostMapping
    public BookFormat createBookFormat(@RequestBody BookFormatDTO bookFormat) {
        return bookFormatService.createBookFormat(bookFormat);
    }

    @PutMapping("/{id}")
    public BookFormat updateBookFormat(@PathVariable("id") Long id, @RequestBody BookFormatDTO bookFormat) {
        return bookFormatService.updateBookFormat(id, bookFormat);
    }

    @DeleteMapping("/{id}")
    public void deleteBookFormat(@PathVariable("id") Long id) {
        bookFormatService.deleteBookFormat(id);
    }
}
