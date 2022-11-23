package com.likelion.jpaapi.repository;

import com.likelion.jpaapi.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
