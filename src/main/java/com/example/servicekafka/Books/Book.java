package com.example.servicekafka.Books;


import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String type;
    private double price;
    private String language;
    private String isbn13;
}
