package com.example.bookcrud.repository;

import com.example.bookcrud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository provides CRUD methods automatically
public interface BookRepository extends JpaRepository<Book, Long> {
}
