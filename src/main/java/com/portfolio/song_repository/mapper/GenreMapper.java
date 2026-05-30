package com.portfolio.song_repository.mapper;

import com.portfolio.song_repository.dto.GenreDTO;
import com.portfolio.song_repository.model.Genre;

public class GenreMapper {
    static GenreDTO toDto(Genre genre) {
        return new GenreDTO(
                genre.getTitle(),
                SongMapper.toDtoList(genre.getRelatedSongs())
        );
    }

    static Genre toEntity(GenreDTO genreDTO) {
        Genre entity = new Genre();

        entity.setTitle(genreDTO.getTitle());
        entity.setRelatedSongs(SongMapper.toEntityList(genreDTO.getRelatedSongs()));

        return entity;
    }
}
