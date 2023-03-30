package com.mhj.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GRDF
 */
@RestController
public class BookController {


    @GetMapping("api/vi/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder().title("One book to go").build();
        var result = List.of(book);
        return ResponseEntity.ok(result);
    }
}
