package com.portfolio.song_repository.services;

import com.portfolio.song_repository.dto.GenreDTO;

import java.util.List;
import java.util.Optional;

public interface GenreService {
    GenreDTO addGenre(GenreDTO genreDTO);
    List<GenreDTO> getAll();
    Optional<GenreDTO> getByTitle(String title);
}
