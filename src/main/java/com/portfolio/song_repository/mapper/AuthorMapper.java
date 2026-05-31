package com.portfolio.song_repository.mapper;

import com.portfolio.song_repository.dto.AuthorDTO;
import com.portfolio.song_repository.model.Author;

import java.util.ArrayList;
import java.util.List;

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

        entity.setName(authorDTO.getName().trim().toUpperCase());
        entity.setCountry(authorDTO.getCountry().trim().toUpperCase());
        entity.setFirstReleaseDate(authorDTO.getFirstReleaseDate());
        entity.setPublishedSongs(SongMapper.toEntityList(authorDTO.getPublishedSongs()));
        entity.setPublishedAlbums(AlbumMapper.toEntityList(authorDTO.getPublishedAlbums()));

        return entity;
    }

    public static List<AuthorDTO> toDtoList(List<Author> authors) {
        List<AuthorDTO> authorDTOS = new ArrayList<>();

        authors.forEach(author -> {
            authorDTOS.add(toDto(author));
        });

        return authorDTOS;
    }
}
