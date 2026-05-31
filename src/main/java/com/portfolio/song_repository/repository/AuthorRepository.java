package com.portfolio.song_repository.repository;

import com.portfolio.song_repository.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByName(String name);
    List<Author> findAllByCountry(String country);
}
