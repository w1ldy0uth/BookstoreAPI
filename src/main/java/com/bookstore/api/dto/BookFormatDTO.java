package com.bookstore.api.dto;

public class BookFormatDTO {
    private String format;

    public BookFormatDTO() {
    }

    public BookFormatDTO(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
