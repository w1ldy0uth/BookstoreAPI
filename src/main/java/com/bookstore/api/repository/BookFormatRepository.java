package com.bookstore.api.repository;

import com.bookstore.api.entity.BookFormat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookFormatRepository extends JpaRepository<BookFormat, Long> {
}
