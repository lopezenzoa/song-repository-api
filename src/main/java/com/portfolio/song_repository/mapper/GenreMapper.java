package com.portfolio.song_repository.mapper;

import com.portfolio.song_repository.dto.GenreDTO;
import com.portfolio.song_repository.model.Genre;

import java.util.ArrayList;
import java.util.List;

public class GenreMapper {
    public static GenreDTO toDto(Genre genre) {
        return new GenreDTO(
                genre.getTitle(),
                SongMapper.toDtoList(genre.getRelatedSongs())
        );
    }

    public static Genre toEntity(GenreDTO genreDTO) {
        Genre entity = new Genre();

        entity.setTitle(genreDTO.getTitle().trim().toUpperCase());
        entity.setRelatedSongs(SongMapper.toEntityList(genreDTO.getRelatedSongs()));

        return entity;
    }

    public static List<GenreDTO> toDtoList(List<Genre> genres) {
        List<GenreDTO> genreDTOS = new ArrayList<>();

        genres.forEach(genre -> genreDTOS.add(toDto(genre)));

        return genreDTOS;
    }
}
