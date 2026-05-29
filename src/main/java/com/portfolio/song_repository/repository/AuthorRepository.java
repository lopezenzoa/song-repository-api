package com.portfolio.song_repository.repository;

import com.portfolio.song_repository.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
