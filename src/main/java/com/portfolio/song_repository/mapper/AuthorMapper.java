package com.portfolio.song_repository.mapper;

import com.portfolio.song_repository.dto.AuthorDTO;
import com.portfolio.song_repository.model.Author;

public class AuthorMapper {
    public static AuthorDTO toDto(Author author) {
        return new AuthorDTO(
                author.getName(),
                author.getCountry(),
                author.getFirstReleaseDate(),
                SongMapper.toDtoList(author.getPublishedSongs()),
                AlbumMapper.toDtoList(author.getPublishedAlbums())
        );
    }

    public static Author toEntity(AuthorDTO authorDTO) {
        Author entity = new Author();

        entity.setName(authorDTO.getName());
        entity.setCountry(authorDTO.getCountry());
        entity.setFirstReleaseDate(authorDTO.getFirstReleaseDate());
        entity.setPublishedSongs(SongMapper.toEntityList(authorDTO.getPublishedSongs()));
        entity.setPublishedAlbums(AlbumMapper.toEntityList(authorDTO.getPublishedAlbums()));

        return entity;
    }
}
