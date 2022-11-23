package com.likelion.jpaapi.service;

import com.likelion.jpaapi.domain.Author;
import com.likelion.jpaapi.domain.Book;
import com.likelion.jpaapi.domain.dto.BookResponse;
import com.likelion.jpaapi.repository.AuthorRepository;
import com.likelion.jpaapi.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<BookResponse> findBooks(Pageable pageable) {
        Page<Book> books = bookRepository.findAll(pageable);
        return books.stream()
                .map(book -> BookResponse.of(book))
                .collect(Collectors.toList());
    }
}
