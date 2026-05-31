package com.portfolio.song_repository.services.impl;

import com.portfolio.song_repository.dto.GenreDTO;
import com.portfolio.song_repository.exceptions.EmptyValueFieldException;
import com.portfolio.song_repository.exceptions.EntityNotFoundException;
import com.portfolio.song_repository.mapper.GenreMapper;
import com.portfolio.song_repository.model.Genre;
import com.portfolio.song_repository.repository.GenreRepository;
import com.portfolio.song_repository.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired private GenreRepository repository;

    @Override
    public GenreDTO addGenre(GenreDTO genreDTO) throws EmptyValueFieldException {
        if (genreDTO.getTitle().trim().isEmpty())
            throw new EmptyValueFieldException("TITLE CAN'T BE BLANK");

        Genre entity = GenreMapper.toEntity(genreDTO);
        Genre savedGenre = repository.save(entity);

        return GenreMapper.toDto(savedGenre);
    }

    @Override
    public List<GenreDTO> getAll() {
        List<Genre> genres = repository.findAll();
        return GenreMapper.toDtoList(genres);
    }

    @Override
    public Optional<GenreDTO> getByTitle(String title) {
        Optional<Genre> genreOptional = repository.findByTitle(title.trim());

        if (genreOptional.isEmpty())
            throw new EntityNotFoundException("THE GENRE '" + title + "' DOESN'T EXIST");

        return genreOptional.map(GenreMapper::toDto);
    }
}
