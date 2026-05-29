package com.portfolio.song_repository.repository;

import com.portfolio.song_repository.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
