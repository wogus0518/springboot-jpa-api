package com.likelion.jpaapi.repository;

import com.likelion.jpaapi.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
