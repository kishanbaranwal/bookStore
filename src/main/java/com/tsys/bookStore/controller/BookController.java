package com.tsys.bookStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.bookStore.dto.BookDto;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
	
	@GetMapping
	public ResponseEntity<List<BookDto>> getBook(){
		BookDto book=BookDto.builder().title("My First book title").build();
		List<BookDto> books = new ArrayList<BookDto>();
		books.add(book);
		
		return  ResponseEntity.ok(books);
		
	}

}
