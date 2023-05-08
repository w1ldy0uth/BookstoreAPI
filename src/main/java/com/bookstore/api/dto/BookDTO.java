package com.bookstore.api.dto;

public class BookDTO {
    private String title;
    private String author;
    private Long format_id;
    private Long size;

    public BookDTO(String title, String author, Long format_id, Long size) {
        this.title = title;
        this.author = author;
        this.format_id = format_id;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getFormat_id() {
        return format_id;
    }

    public void setFormat_id(Long format_id) {
        this.format_id = format_id;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
