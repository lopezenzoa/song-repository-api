package com.portfolio.song_repository.services;

import com.portfolio.song_repository.dto.AuthorDTO;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    AuthorDTO addAuthor(AuthorDTO authorDTO);
    List<AuthorDTO> getAll();
    Optional<AuthorDTO> getByName(String name);
    List<AuthorDTO> getByCountry(String name);
}
